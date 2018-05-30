import 'package:flutter/material.dart';

void main() => runApp(new MaterialApp(
  title: 'Flutter Tutorial',
  home: new TutorialHome(),
));

class TutorialHome extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      appBar: new AppBar(
        title: new Text('Example Title'),
        leading: new IconButton(
            icon: new Icon(Icons.menu),
            tooltip:  'Navigation Menu',
            onPressed: null),
        actions: <Widget>[
          new IconButton(
              icon: new Icon(Icons.search),
              tooltip: 'Search',
              onPressed: null)
        ],
      ),

      body: new Row(
        children: <Widget>[
          const FlutterLogo(),
          const Expanded(
              child: const Text('Flutter\'s hot reload helps you quickly and easily experiment, build UIs, add features, and fix bug faster. Experience sub-second reload times, without losing state, on emulators, simulators, and hardware for iOS and Android.'),
          ),
          const Icon(
              Icons.sentiment_very_satisfied,
            color: Colors.green,
            size: 51.0,
            textDirection: TextDirection.rtl,
          ),
        ],
      ),


//      new Center(
//        child: new Text('Hello World'),
//      ),


//      body: new Column(
//        children: <Widget>[
//          new Text('Test element 1'),
//          new Text('Test Element 2'),
//          //const FlutterLogo(),
//
////          new Expanded(
////              child: const FlutterLogo(),
////          ),
//
//          new Expanded(
//            child: new FittedBox(
//              fit: BoxFit.contain,
//              child: const FlutterLogo(),
//            ),
//          ),
//        ],
//      ),


//      body: new Column(
//        crossAxisAlignment: CrossAxisAlignment.start,
//        mainAxisSize: MainAxisSize.min,
//        children: <Widget>[
//          new Text('We move under cover and we move as one cover and we move as one We move under cover and we move as one We move under cover and we move as one '),
//          new Text('Through the night, we have one shot to live another day'),
//          new Text(
//              'We cannot let a stray gunshot give us away',
//            textDirection: TextDirection.ltr,
//          ),
//          new Text('We will fight up close, seize the moment and stay in it'),
//          new Text('It’s either that or meet the business end of a bayonet'),
//          new Text('The code word is ‘Rochambeau,’ dig me?'),
//          new Text('Rochambeau!', style: DefaultTextStyle.of(context).style.apply(fontSizeFactor: 2.0)),
//          //new Image.asset('graphics/sample.png')
//        ],
//      ),


      floatingActionButton: new FloatingActionButton(
        tooltip: 'Add',
        child: new Icon(Icons.add),
        onPressed: null,
      ),
    );
  }
}

class MyButton extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return new GestureDetector(
      onTap: () {
        print('Button Tapped');
      },
      child:
      new Container(
        height: 36.0,
        padding: const EdgeInsets.all(8.0),
        margin: const EdgeInsets.symmetric(horizontal:8.0),
        decoration: new BoxDecoration(
          borderRadius: new BorderRadius.circular(5.0),
          color: Colors.lightGreen,
        ),
        child: new Center(
          child: new Text('Button'),
        ),
      ),

    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  _MyHomePageState createState() => new _MyHomePageState();
}


class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      // This call to setState tells the Flutter framework that something has
      // changed in this State, which causes it to rerun the build method below
      // so that the display can reflect the updated values. If we changed
      // _counter without calling setState(), then the build method would not be
      // called again, and so nothing would appear to happen.
      _counter++;
    });
  }


  @override
  Widget build(BuildContext context) {
    // This method is rerun every time setState is called, for instance as done
    // by the _incrementCounter method above.
    //
    // The Flutter framework has been optimized to make rerunning build methods
    // fast, so that you can just rebuild anything that needs updating rather
    // than having to individually change instances of widgets.
    return new Scaffold(
      appBar: new AppBar(
        // Here we take the value from the MyHomePage object that was created by
        // the App.build method, and use it to set our appbar title.
        title: new Text(widget.title),
      ),
      body: new Center(
        // Center is a layout widget. It takes a single child and positions it
        // in the middle of the parent.
        child: new Column(
          // Column is also layout widget. It takes a list of children and
          // arranges them vertically. By default, it sizes itself to fit its
          // children horizontally, and tries to be as tall as its parent.
          //
          // Invoke "debug paint" (press "p" in the console where you ran
          // "flutter run", or select "Toggle Debug Paint" from the Flutter tool
          // window in IntelliJ) to see the wireframe for each widget.
          //
          // Column has various properties to control how it sizes itself and
          // how it positions its children. Here we use mainAxisAlignment to
          // center the children vertically; the main axis here is the vertical
          // axis because Columns are vertical (the cross axis would be
          // horizontal).
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            new Text(
              'You have pushed the button this many times:',
            ),
            new Text(
              '$_counter',
              style: Theme.of(context).textTheme.display1,
            ),
          ],
        ),
      ),
      floatingActionButton: new FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        child: new Icon(Icons.add),
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
