import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:module/pages/destination_page.dart';
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
    );
  }

}

Widget _widgetRoute(String defaultRouteName) {
  switch (defaultRouteName) {
    case 'destination':
      return DestinationPage();
    case 'travel':
      return TravelPage();
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
