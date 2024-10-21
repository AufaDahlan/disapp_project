package com.example.realtime

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity()
// import android.os.Bundle
// import android.media.MediaScannerConnection
// import io.flutter.embedding.android.FlutterActivity
// import io.flutter.plugin.common.MethodChannel

// class MainActivity: FlutterActivity() {
//     private val CHANNEL = "com.example.app/media_scan"

//     override fun onCreate(savedInstanceState: Bundle?) {
//         super.onCreate(savedInstanceState)

//         MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
//             if (call.method == "scanMedia") {
//                 val filePath = call.argument<String>("filePath")
//                 scanFile(filePath)
//                 result.success(null)
//             } else {
//                 result.notImplemented()
//             }
//         }
//     }

//     private fun scanFile(filePath: String?) {
//         if (filePath != null) {
//             MediaScannerConnection.scanFile(this, arrayOf(filePath), null, null)
//         }
//     }
// }
