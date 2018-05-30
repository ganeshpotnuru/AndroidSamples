import 'package:flutter/material.dart';

void main() => runApp(new TabBarApp());

class TabBarApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      title: 'Flutter Demo',
      theme: new ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or press Run > Flutter Hot Reload in IntelliJ). Notice that the
        // counter didn't reset back to zero; the application is not restarted.
        primarySwatch: Colors.blue,
      ),
      home: new TabBarDemo(title: 'Flutter Demo Home Page'),
    );
  }
}

class TabBarDemo extends StatefulWidget {
  TabBarDemo({Key key, this.title}) : super(key: key);

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  _TabBarDemoState createState() => new _TabBarDemoState();
}

class _TabBarDemoState extends State<TabBarDemo> {

  @override
  Widget build(BuildContext context) {
    // This method is rerun every time setState is called, for instance as done
    // by the _incrementCounter method above.
    //
    // The Flutter framework has been optimized to make rerunning build methods
    // fast, so that you can just rebuild anything that needs updating rather
    // than having to individually change instances of widgets.

      return new MaterialApp(
        home: new DefaultTabController(
          length: 3,
          child: new Scaffold(
            appBar: new AppBar(
              bottom: new TabBar(
                  tabs: [
                    new Tab(icon: new Icon(Icons.directions_car)),
                    new Tab(icon: new Icon(Icons.directions_transit)),
                    new Tab(icon: new Icon(Icons.directions_bike)),
                  ],
              ),
              title: new Text('Tabs Demo'),
            ),
            body: new TabBarView(
                children: [
                  new Icon(Icons.directions_car),
                  new Icon(Icons.directions_transit),
                  new Icon(Icons.directions_bike),
                ],
            ),
          ),
        ),
      );
    }
  }