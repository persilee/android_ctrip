import 'package:flutter/services.dart';

class MethodChannelPlugin {

  static const MethodChannel methodChannel = MethodChannel('MethodChannelPlugin');

  static Future<void> gotoDestinationSearchPage() async {
    try {
      await methodChannel.invokeMethod('gotoDestinationSearchPage');
    } on PlatformException {
      print('Failed go to gotoDestinationSearchPage');
    }
  }

  static Future<void> gotoTravelSearchPage() async {
    try {
      await methodChannel.invokeMethod('gotoTravelSearchPage');
    } on PlatformException {
      print('Failed go to gotoTravelSearchPage');
    }
  }

  static Future<void> gotoSpeakPage(String pageType) async {
    try {
      await methodChannel.invokeMethod('gotoSpeakPage',{'pageType': pageType});
    } on PlatformException {
      print('Failed go to gotoSpeakPage');
    }
  }

  static Future<void> gotoWebView(String url) async {
    try {
      await methodChannel.invokeMethod('gotoWebView',{'url': url});
    } on PlatformException {
      print('Failed go to gotoWebView');
    }
  }

}