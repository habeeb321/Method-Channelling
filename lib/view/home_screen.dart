import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  var channel = const MethodChannel("Habeeb");
  showToast() {
    channel.invokeMethod("ShowToast");
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.amber,
      body: Center(
        child: 
        ElevatedButton(
          onPressed: () {
            showToast();
          },
          child: const Text('Show Toast'),
        ),
      ),
    );
  }
}
