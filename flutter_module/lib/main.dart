import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:module/pages/destination_page.dart';
import 'package:module/pages/destination_search_page.dart';
import 'package:module/pages/travel_page.dart';

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
  switch (defaultRouteName) {
    case 'destination':
      return DestinationPage();
    case 'travel':
      return TravelPage();
    case 'destination/search':
      return DestinationSearchPage(
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
