import 'dart:async';
import 'dart:convert';

import 'package:http/http.dart' as http;
import 'package:module/model/destination_search_model.dart';

//旅拍搜索接口

var Params = {"contentType":"json","head":{"cid":"09031043410934928682","ctok":"","cver":"1.0","lang":"01","sid":"8888","syscode":"09","auth":"","extension":[]},"keyword":"h","channel":"H5","sourceVersion":"823000","tab":"1","saleCity":2,"departureCity":2};



class DestinationSearchDao {
  static Future<DestinationSearchModel> fetch(
      String url, String keyword) async {
    Params['keyword'] = keyword;

    final response = await http.post(url, body: jsonEncode(Params));
    if (response.statusCode == 200) {
      Utf8Decoder utf8decoder = Utf8Decoder(); // fix 中文乱码
      var result = json.decode(utf8decoder.convert(response.bodyBytes));
      DestinationSearchModel model = DestinationSearchModel.fromJson(result);
      model.keyword = keyword;
      return model;
    } else {
      throw Exception('Failed to load travel');
    }
  }
}
