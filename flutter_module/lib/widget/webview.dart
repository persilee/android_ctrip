import 'dart:async';
import 'package:clone_flutter_webview_plugin/clone_flutter_webview_plugin.dart';
import 'package:flutter/material.dart';

const CATCH_URLS = [
  'm.ctrip.com/',
  'm.ctrip.com/html5/',
  'm.ctrip.com/html5',
  'm.ctrip.com/html5/you/',
  'm.ctrip.com/webapp/you/foods/',
  'm.ctrip.com/webapp/vacations/tour/list'
];

const kAndroidUserAgent =
    'Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Mobile Safari/537.36';

class WebView extends StatefulWidget {
  String url;
  final String statusBarColor;
  final String title;
  final bool hideAppBar;
  final bool backForbid;
  final bool hideHead;

  WebView(
      {this.url,
      this.statusBarColor,
      this.title,
      this.hideAppBar,
      this.backForbid = false,
      this.hideHead = false}) {
    if (url != null && url.contains('ctrip.com')) {
      url = url.replaceAll('http://', 'https://');
    }
  }

  @override
  _WebViewState createState() => _WebViewState();
}

class _WebViewState extends State<WebView> {
  final webViewReference = new FlutterWebviewPlugin();
  StreamSubscription<String> _onUrlChanged;
  StreamSubscription<WebViewStateChanged> _onStateChanged;
  StreamSubscription<WebViewHttpError> _onHttpError;
  bool exiting = false;

  @override
  void initState() {
    webViewReference.close();
    print(widget.url);
    _onUrlChanged = webViewReference.onUrlChanged.listen((String url) {});
    _onStateChanged =
        webViewReference.onStateChanged.listen((WebViewStateChanged state) {
      switch (state.type) {
        case WebViewState.startLoad:
          if (_isToMain(state.url) && !exiting) {
            if (widget.backForbid) {
              webViewReference.launch(widget.url);
            } else {
              Navigator.pop(context);
              exiting = true;
            }
          }
          break;
        default:
          break;
      }
    });
    _onHttpError =
        webViewReference.onHttpError.listen((WebViewHttpError error) {});
    super.initState();
  }

  _isToMain(String url) {
    bool contain = false;
    for (final value in CATCH_URLS) {
      if (url?.endsWith(value) ?? false) {
        contain = true;
        break;
      }
    }
    return contain;
  }

  @override
  void dispose() {
    _onUrlChanged.cancel();
    _onStateChanged.cancel();
    _onHttpError.cancel();
    webViewReference.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    String statusBarColorStr = widget.statusBarColor ?? 'ffffff';
    Color backButtonColor;
    if (statusBarColorStr == 'ffffff') {
      backButtonColor = Colors.black;
    } else {
      backButtonColor = Colors.white;
    }
    return Scaffold(
      body: MediaQuery.removePadding(
        removeTop: true,
        context: context,
        child: Column(
          children: <Widget>[
            _appBar(
                Color(int.parse('0xff' + statusBarColorStr)), backButtonColor),
            Expanded(
              child: WebviewScaffold(
                userAgent: kAndroidUserAgent,
                url: widget.url,
                withZoom: true,
                withLocalStorage: true,
                hidden: false,
                initialChild: Container(
                  color: Colors.white,
                  child: Center(
                    child: CircularProgressIndicator(),
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }

  _appBar(Color backgroundColor, Color backButtonColor) {
    if (widget.hideAppBar ?? false) {
      return widget.hideHead
          ? Container()
          : Container(
              color: backgroundColor,
              height:
                  Theme.of(context).platform == TargetPlatform.iOS ? 34 : 29,
              width: double.infinity,
            );
    }

    return Container(
      color: backgroundColor,
      padding: EdgeInsets.fromLTRB(0, 38, 0, 10),
      child: FractionallySizedBox(
        widthFactor: 1,
        child: Stack(
          children: <Widget>[
            GestureDetector(
              onTap: () {
                Navigator.pop(context);
              },
              child: Container(
                margin: EdgeInsets.only(left: 10),
                child: Icon(
                  Icons.close,
                  color: backButtonColor,
                  size: 24,
                ),
              ),
            ),
            Positioned(
              left: 0,
              right: 0,
              child: Center(
                child: Text(
                  widget.title ?? '',
                  style: TextStyle(color: backButtonColor, fontSize: 18),
                ),
              ),
            )
          ],
        ),
      ),
    );
  }
}
