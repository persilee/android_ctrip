import 'dart:ui';

import 'package:flutter/material.dart';

void main() => runApp(_widgetRoute(window.defaultRouteName));

Widget _widgetRoute(String defaultRouteName) {
  switch (defaultRouteName) {
    case 'destination':
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text('destination',
                style: TextStyle(color: Colors.black),
                textDirection: TextDirection.ltr),
          ],
        ),
      );
    case 'travel':
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text('travel',
                style: TextStyle(color: Colors.black),
                textDirection: TextDirection.ltr),
          ],
        ),
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
