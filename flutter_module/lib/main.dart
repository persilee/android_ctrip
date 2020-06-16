import 'dart:ui';
import 'dart:convert' as convert;

import 'package:flutter/material.dart';
import 'package:module/pages/destination_page.dart';
import 'package:module/pages/destination_search_page.dart';
import 'package:module/pages/search_page.dart';
import 'package:module/pages/speak_page.dart';
import 'package:module/pages/travel_page.dart';
import 'package:module/pages/travel_search_page.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter model',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        fontFamily: 'PingFang',
      ),
      home: _widgetRoute(window.defaultRouteName),
//      onGenerateRoute: (settings){
//        return _widgetRoute(settings.name);
//      },
    );
  }

}

Widget _widgetRoute(String defaultRouteName) {

  var placeHolder = '';
  if(defaultRouteName.startsWith('{')){
    Map<String, dynamic> params = convert.jsonDecode(defaultRouteName);
    defaultRouteName = params['routeName'];
    placeHolder = params['placeHolder'];
  }

  switch (defaultRouteName) {
    case 'destination':
      return DestinationPage();
    case 'travel':
      return TravelPage();
    case 'destination/search':
      return DestinationSearchPage(
        hideLeft: false,
      );
    case 'speak/destination':
      return SpeakPage(
        pageType: 'destination',
      );
    case 'speak/travel':
      return SpeakPage(
        pageType: 'travel',
      );
    case 'speak/home':
      return SpeakPage(
        pageType: 'home',
      );
    case 'travel/search':
      return TravelSearchPage(
        hint: '',
        hideLeft: false,
      );
    case 'search':
      return SearchPage(
        hint: placeHolder ?? '',
        hideLeft: false,
      );
    default:
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text('not found $defaultRouteName',
                textDirection: TextDirection.ltr),
          ],
        ),
      );
  }
}

//MaterialPageRoute _widgetRoute(String defaultRouteName) {
//  switch (defaultRouteName) {
//    case 'destination':
//      return MaterialPageRoute(builder: (context) => DestinationPage());
//    case 'travel':
//      return MaterialPageRoute(builder: (context) => TravelPage());
//    case 'destination/search':
//      return MaterialPageRoute(builder: (context) => DestinationSearchPage(hideLeft: false,));
//    default:
//      return MaterialPageRoute(builder: (context) => Center(
//        child: Column(
//          mainAxisAlignment: MainAxisAlignment.center,
//          children: <Widget>[
//            Text('not found $defaultRouteName',
//                textDirection: TextDirection.ltr),
//          ],
//        ),
//      ));
//  }
//}
