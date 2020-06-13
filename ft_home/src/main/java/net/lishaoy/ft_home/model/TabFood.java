package net.lishaoy.ft_home.model;

import com.google.gson.Gson;

import java.util.List;

public class TabFood {

    /**
     * TotalCount : 179728
     * District : {"DistrictId":26,"DistrictName":"深圳","EName":"Shenzhen","InChina":true,"IsOversea":false,"ParentDistrictId":0}
     * IsShowSwitcher : false
     * ABTestVersion : b
     * BrowseVersion : 2
     * Shops : null
     * CustomFilter : [{"Type":6,"Id":"15","SubId":null,"Name":"中国餐厅周特惠套餐","Lat":0,"Lon":0,"IsShowByNow":false,"Tips":null,"PicUrlClick":null,"PicUrlUnClick":null,"Icon":null},{"Type":20,"Id":"5","SubId":null,"Name":"精选好店","Lat":0,"Lon":0,"IsShowByNow":false,"Tips":null,"PicUrlClick":null,"PicUrlUnClick":null,"Icon":"https://pages.c-ctrip.com/you/foods/msl_food_revision_detail_icon_good_res_new.png"},{"Type":21,"Id":"6","SubId":null,"Name":"榜单餐厅","Lat":0,"Lon":0,"IsShowByNow":false,"Tips":null,"PicUrlClick":null,"PicUrlUnClick":null,"Icon":"https://pages.c-ctrip.com/you/foods/msl_food_revision_detail_icon_rank.png"},{"Type":7,"Id":"102","SubId":null,"Name":"老字号","Lat":0,"Lon":0,"IsShowByNow":false,"Tips":null,"PicUrlClick":null,"PicUrlUnClick":null,"Icon":"https://pages.c-ctrip.com/you/foods/msl_food_revision_detail_icon_oldzihao_new.png"},{"Type":6,"Id":"4","SubId":null,"Name":"订座","Lat":0,"Lon":0,"IsShowByNow":false,"Tips":null,"PicUrlClick":null,"PicUrlUnClick":null,"Icon":"https://pages.c-ctrip.com/you/foods/msl_food_revision_detail_icon_dingzuo.png"},{"Type":6,"Id":"100","SubId":null,"Name":"特惠套餐","Lat":0,"Lon":0,"IsShowByNow":false,"Tips":null,"PicUrlClick":null,"PicUrlUnClick":null,"Icon":null},{"Type":11,"Id":"2","SubId":null,"Name":"价格100-200","Lat":0,"Lon":0,"IsShowByNow":false,"Tips":null,"PicUrlClick":null,"PicUrlUnClick":null,"Icon":null}]
     * RecommendDistricts : null
     * Filter : {"LandmarkSort":[{"Id":8370,"Name":"东门老街","Lat":22.545400619506836,"Lon":114.11900329589844},{"Id":11443,"Name":"福田站","Lat":22.538700103759766,"Lon":114.05699920654297},{"Id":10872,"Name":"宝安国际机场","Lat":22.62540054321289,"Lon":113.81300354003906},{"Id":8360,"Name":"世界之窗","Lat":22.53459930419922,"Lon":113.9729995727539},{"Id":8380,"Name":"深圳湾公园","Lat":22.504100799560547,"Lon":113.9530029296875},{"Id":11243,"Name":"深圳北站","Lat":22.60919952392578,"Lon":114.02899932861328},{"Id":11863,"Name":"蛇口站","Lat":22.48040008544922,"Lon":113.89900207519531},{"Id":8364,"Name":"地王观光","Lat":22.542699813842773,"Lon":114.11100006103516},{"Id":8367,"Name":"东部华侨城","Lat":22.626699447631836,"Lon":114.28800201416016},{"Id":8368,"Name":"深圳欢乐海岸","Lat":22.523399353027344,"Lon":113.98799896240234},{"Id":8372,"Name":"小梅沙海洋世界","Lat":22.60449981689453,"Lon":114.3290023803711},{"Id":8373,"Name":"仙湖植物园","Lat":22.57859992980957,"Lon":114.17500305175781},{"Id":8378,"Name":"深圳市民中心","Lat":22.54360008239746,"Lon":114.05999755859375},{"Id":8381,"Name":"大梅沙海滨公园","Lat":22.59239959716797,"Lon":114.30799865722656},{"Id":8382,"Name":"华强北路","Lat":22.546300888061523,"Lon":114.08699798583984},{"Id":8384,"Name":"沙头角中英街","Lat":22.541799545288086,"Lon":114.23100280761719},{"Id":8385,"Name":"大芬油画村","Lat":22.609600067138672,"Lon":114.13600158691406},{"Id":8389,"Name":"羊台山森林公园","Lat":22.651399612426758,"Lon":113.96499633789062},{"Id":10599,"Name":"甘坑客家小镇","Lat":22.654499053955078,"Lon":114.10600280761719},{"Id":11081,"Name":"深圳西站","Lat":22.528400421142578,"Lon":113.90799713134766},{"Id":8361,"Name":"深圳欢乐谷","Lat":22.54159927368164,"Lon":113.98100280761719},{"Id":8362,"Name":"锦绣中华民俗文化村","Lat":22.5310001373291,"Lon":113.98799896240234},{"Id":8363,"Name":"深圳野生动物园","Lat":22.598899841308594,"Lon":113.97200012207031},{"Id":8365,"Name":"莲花山公园","Lat":22.553499221801758,"Lon":114.05899810791016},{"Id":8366,"Name":"红树林","Lat":22.52440071105957,"Lon":114.01300048828125},{"Id":8369,"Name":"欢乐海岸海洋奇梦馆","Lat":22.52549934387207,"Lon":113.98899841308594},{"Id":8371,"Name":"青青世界","Lat":22.50029945373535,"Lon":113.9010009765625},{"Id":8374,"Name":"园博园","Lat":22.534900665283203,"Lon":113.99800109863281},{"Id":8375,"Name":"观澜山水田园旅游文化园","Lat":22.714099884033203,"Lon":114.10700225830078},{"Id":8376,"Name":"海上世界","Lat":22.482999801635742,"Lon":113.91699981689453},{"Id":8377,"Name":"罗湖口岸","Lat":22.527999877929688,"Lon":114.11900329589844},{"Id":8379,"Name":"东部华侨城大侠谷","Lat":22.618799209594727,"Lon":114.28800201416016},{"Id":8383,"Name":"荷兰花卉小镇","Lat":22.54290008544922,"Lon":113.91000366210938},{"Id":8386,"Name":"东部华侨城茶溪谷","Lat":22.63129997253418,"Lon":114.28199768066406},{"Id":8388,"Name":"荔枝公园","Lat":22.54560089111328,"Lon":114.10199737548828},{"Id":11080,"Name":"深圳东站","Lat":22.60219955444336,"Lon":114.12000274658203},{"Id":11082,"Name":"深圳站","Lat":22.53179931640625,"Lon":114.11699676513672},{"Id":11242,"Name":"坂田站","Lat":22.62470054626465,"Lon":114.0530014038086},{"Id":11351,"Name":"光明城站","Lat":22.732900619506836,"Lon":113.9540023803711},{"Id":11357,"Name":"深圳坪山站","Lat":22.707700729370117,"Lon":114.3270034790039},{"Id":11517,"Name":"平湖站","Lat":22.69230079650879,"Lon":114.125},{"Id":11757,"Name":"布吉站","Lat":22.601699829101562,"Lon":114.12200164794922}],"ZoneSort":[{"ZoneId":19211009,"ZoneName":"体育中心"},{"ZoneId":19997051,"ZoneName":"深圳国际会展中心商圈"},{"ZoneId":21130364,"ZoneName":"坑梓商业区"},{"ZoneId":126,"ZoneName":"华侨城"},{"ZoneId":127,"ZoneName":"深圳湾口岸/蛇口"},{"ZoneId":128,"ZoneName":"会展中心/CBD"},{"ZoneId":157,"ZoneName":"华强北商业区"},{"ZoneId":159,"ZoneName":"东门商业区"},{"ZoneId":320,"ZoneName":"大小梅沙/东部华侨城"},{"ZoneId":723,"ZoneName":"宝安商业区"},{"ZoneId":724,"ZoneName":"龙岗中心区/大运新城"},{"ZoneId":995,"ZoneName":"坪山高铁站商圈"},{"ZoneId":996,"ZoneName":"光明农场商圈"},{"ZoneId":997,"ZoneName":"盐田区政府/沙头角"},{"ZoneId":998,"ZoneName":"南澳"},{"ZoneId":999,"ZoneName":"布吉/深圳东站"},{"ZoneId":1000,"ZoneName":"松岗商业中心区"},{"ZoneId":1001,"ZoneName":"深圳北站地区"},{"ZoneId":1002,"ZoneName":"宝安机场"},{"ZoneId":1006,"ZoneName":"科技园"},{"ZoneId":1008,"ZoneName":"公明广场商圈"},{"ZoneId":1010,"ZoneName":"罗湖口岸/火车站"},{"ZoneId":1011,"ZoneName":"海岸城/后海"},{"ZoneId":12157,"ZoneName":"万象城/京基100"},{"ZoneId":12158,"ZoneName":"罗湖体育馆/梧桐山风景区"},{"ZoneId":12159,"ZoneName":"皇岗口岸/福田口岸"},{"ZoneId":12160,"ZoneName":"大学城/西丽动物园"},{"ZoneId":12161,"ZoneName":"坂田"},{"ZoneId":12162,"ZoneName":"观澜"},{"ZoneId":12163,"ZoneName":"葵涌/官湖商圈"},{"ZoneId":12164,"ZoneName":"较场尾/大鹏所城"},{"ZoneId":12165,"ZoneName":"杨梅坑/桔钓沙"},{"ZoneId":12166,"ZoneName":"东涌/西涌"},{"ZoneId":14726,"ZoneName":"田贝/水贝珠宝城"},{"ZoneId":14727,"ZoneName":"笋岗/八卦岭"},{"ZoneId":14728,"ZoneName":"莲花山/梅林"},{"ZoneId":14729,"ZoneName":"平湖/华南城"},{"ZoneId":14744,"ZoneName":"石岩"}],"DistanceSort":null,"CuisineSort":[{"Id":10000001,"Name":"地方菜","Children":[{"Id":10000001,"Name":"全部","Children":null},{"Id":4898,"Name":"粤菜","Children":null},{"Id":4915,"Name":"湘菜","Children":null},{"Id":4896,"Name":"川菜","Children":null},{"Id":4897,"Name":"江浙菜","Children":null},{"Id":4909,"Name":"本帮菜","Children":null},{"Id":4924,"Name":"东北菜","Children":null},{"Id":4939,"Name":"客家菜","Children":null},{"Id":4923,"Name":"西北菜","Children":null},{"Id":4899,"Name":"北京菜","Children":null},{"Id":4919,"Name":"云南菜","Children":null},{"Id":4925,"Name":"新疆菜","Children":null},{"Id":4913,"Name":"湖北菜","Children":null},{"Id":4911,"Name":"徽菜","Children":null},{"Id":4926,"Name":"海南菜","Children":null},{"Id":4917,"Name":"台湾菜","Children":null},{"Id":4914,"Name":"贵州菜","Children":null},{"Id":4912,"Name":"江西菜","Children":null},{"Id":4916,"Name":"闽菜","Children":null},{"Id":4918,"Name":"广西菜","Children":null},{"Id":5031,"Name":"内蒙菜","Children":null},{"Id":4920,"Name":"鲁菜","Children":null},{"Id":4922,"Name":"山西菜","Children":null},{"Id":4921,"Name":"河南菜","Children":null},{"Id":5038,"Name":"其他中餐","Children":null}]},{"Id":10000002,"Name":"西餐","Children":[{"Id":10000002,"Name":"全部","Children":null},{"Id":4962,"Name":"牛排","Children":null},{"Id":4953,"Name":"法国菜","Children":null},{"Id":4954,"Name":"意大利菜","Children":null},{"Id":4958,"Name":"地中海菜","Children":null},{"Id":5044,"Name":"美国菜","Children":null},{"Id":4955,"Name":"西班牙菜","Children":null},{"Id":4956,"Name":"土耳其菜","Children":null},{"Id":7046,"Name":"德国菜","Children":null},{"Id":4960,"Name":"披萨","Children":null},{"Id":4961,"Name":"意大利面","Children":null},{"Id":4907,"Name":"拉美料理","Children":null},{"Id":7041,"Name":"英国菜","Children":null},{"Id":7051,"Name":"希腊菜","Children":null},{"Id":4957,"Name":"俄罗斯菜","Children":null}]},{"Id":4903,"Name":"火锅","Children":[{"Id":4903,"Name":"全部","Children":null},{"Id":4976,"Name":"川味/重庆火锅","Children":null},{"Id":4974,"Name":"老北京火锅","Children":null},{"Id":4975,"Name":"小火锅","Children":null},{"Id":4973,"Name":"粥火锅","Children":null},{"Id":4972,"Name":"鱼火锅","Children":null}]},{"Id":4904,"Name":"日本料理","Children":[{"Id":4904,"Name":"全部","Children":null},{"Id":4980,"Name":"寿司","Children":null},{"Id":4979,"Name":"日式铁板烧","Children":null},{"Id":4981,"Name":"居酒屋","Children":null},{"Id":4982,"Name":"日式火锅","Children":null},{"Id":5041,"Name":"日式拉面","Children":null}]},{"Id":4931,"Name":"烧烤","Children":[{"Id":4931,"Name":"全部","Children":null},{"Id":5043,"Name":"烤肉","Children":null}]},{"Id":4908,"Name":"小吃","Children":[{"Id":4908,"Name":"全部","Children":null},{"Id":4996,"Name":"面食","Children":null},{"Id":5000,"Name":"麻辣烫","Children":null},{"Id":4995,"Name":"熟食/卤味/烧腊","Children":null},{"Id":4997,"Name":"米粉/米线","Children":null},{"Id":4999,"Name":"小龙虾","Children":null},{"Id":5002,"Name":"零食/干货","Children":null}]},{"Id":4905,"Name":"韩国料理","Children":[{"Id":4905,"Name":"全部","Children":null},{"Id":4983,"Name":"韩国烤肉","Children":null},{"Id":4985,"Name":"韩式火锅","Children":null}]},{"Id":4901,"Name":"快餐简餐","Children":[{"Id":4901,"Name":"全部","Children":null},{"Id":4964,"Name":"中式快餐","Children":null},{"Id":4963,"Name":"西式快餐","Children":null},{"Id":7036,"Name":"三明治","Children":null}]},{"Id":4902,"Name":"面包甜点","Children":[{"Id":4902,"Name":"全部","Children":null},{"Id":4966,"Name":"西式甜点","Children":null},{"Id":4968,"Name":"面包店","Children":null},{"Id":4970,"Name":"饮品","Children":null},{"Id":4967,"Name":"冰激凌","Children":null},{"Id":4969,"Name":"中式甜品","Children":null}]},{"Id":4906,"Name":"东南亚菜","Children":[{"Id":4906,"Name":"全部","Children":null},{"Id":4986,"Name":"泰国菜","Children":null},{"Id":4990,"Name":"越南菜","Children":null},{"Id":4989,"Name":"印度菜","Children":null},{"Id":4988,"Name":"马来西亚菜","Children":null},{"Id":4987,"Name":"新加坡菜","Children":null}]},{"Id":4929,"Name":"咖啡店","Children":[]},{"Id":4934,"Name":"海鲜","Children":[]},{"Id":4938,"Name":"创意菜","Children":[]},{"Id":4927,"Name":"酒吧/酒馆","Children":[]},{"Id":4910,"Name":"农家菜","Children":[]},{"Id":4936,"Name":"自助餐","Children":[]},{"Id":7056,"Name":"亚洲菜","Children":[]},{"Id":4928,"Name":"素食","Children":[]},{"Id":4930,"Name":"清真菜","Children":[]},{"Id":4935,"Name":"茶馆/茶室","Children":[]},{"Id":4933,"Name":"中东料理","Children":[]},{"Id":20596,"Name":"融合菜","Children":[]},{"Id":4932,"Name":"非洲菜","Children":[]},{"Id":4940,"Name":"其他","Children":[]}],"DefaultSort":[{"Id":24,"Name":"智能排序"},{"Id":23,"Name":"距离最近"},{"Id":5,"Name":"人均最高"},{"Id":4,"Name":"人均最低"}],"SellSort":[{"Id":9999999,"Name":"全部"},{"Id":100,"Name":"特惠套餐"},{"Id":4,"Name":"订座"}],"PriceSort":[{"Id":4,"Name":"300以上"},{"Id":3,"Name":"200-300"},{"Id":2,"Name":"100-200"},{"Id":1,"Name":"100以内"}],"SceneSort":[{"Id":1152,"Name":"深夜营业"},{"Id":1153,"Name":"下午茶"},{"Id":1189,"Name":"早茶"},{"Id":1156,"Name":"景观餐厅"},{"Id":102,"Name":"老字号"},{"Id":6414,"Name":"海景餐厅"},{"Id":1151,"Name":"酒店餐厅"},{"Id":1376,"Name":"Brunch"},{"Id":6412,"Name":"高空景观"},{"Id":6415,"Name":"特色早餐"},{"Id":1157,"Name":"名人光顾"},{"Id":1197,"Name":"糖水铺"},{"Id":1154,"Name":"主题餐厅"},{"Id":6419,"Name":"品质奶茶店"},{"Id":6413,"Name":"露台餐厅"},{"Id":6420,"Name":"高颜值餐厅"},{"Id":1406,"Name":"知名连锁"},{"Id":6417,"Name":"撸串圣地"},{"Id":1178,"Name":"伴手礼"},{"Id":6418,"Name":"精致餐饮"},{"Id":6416,"Name":"老牌糕点"},{"Id":1375,"Name":"明星主厨"},{"Id":1407,"Name":"外国人喜欢"},{"Id":6426,"Name":"情侣约会"},{"Id":1404,"Name":"明星老板"},{"Id":6422,"Name":"百年老店"},{"Id":1182,"Name":"影视取景地"},{"Id":101,"Name":"美食街"},{"Id":6421,"Name":"设计师餐厅"},{"Id":6408,"Name":"大排档"},{"Id":6427,"Name":"家庭聚餐"},{"Id":1155,"Name":"老建筑餐厅"},{"Id":1395,"Name":"亲子餐厅"},{"Id":6409,"Name":"庭院餐厅"},{"Id":6410,"Name":"花园餐厅"},{"Id":1171,"Name":"夜市小吃"},{"Id":1185,"Name":"洋房餐厅"},{"Id":1191,"Name":"苍蝇馆子"},{"Id":6424,"Name":"非遗美食"},{"Id":6425,"Name":"闺蜜聚会"},{"Id":6428,"Name":"商务宴请"},{"Id":6431,"Name":"工业风"}],"FoodSort":["鲍鱼","烧鹅","基围虾","三黄鸡","肠粉","潮汕牛肉火锅","腊鸭","乌头鱼","鲜蚝","虾饺","乳鸽","干炒牛河","客家酿豆腐","烤生蚝"],"ShiMeiLin":[{"Id":30,"Name":"全部美食林","Intro":"美食家推荐，携程精选认证，不辜负旅行中的每一餐","Count":546},{"Id":1,"Name":"美食林三星","Intro":"一辈子总要去一次的餐厅","Count":3},{"Id":2,"Name":"美食林二星","Intro":"值得专程预约的餐厅","Count":6},{"Id":3,"Name":"美食林一星","Intro":"能给旅行带来惊喜的餐厅","Count":31},{"Id":4,"Name":"美食林臻选","Intro":"精致餐厅，品味推荐","Count":330},{"Id":5,"Name":"美食林风味","Intro":"本地特色，人气小馆","Count":176}],"RegionSort":[{"Id":"207","Name":"福田区"},{"Id":"209","Name":"盐田区"},{"Id":"211","Name":"龙岗区"},{"Id":"213","Name":"南山区"},{"Id":"214","Name":"宝安区"},{"Id":"215","Name":"罗湖区"},{"Id":"104148","Name":"龙华区"},{"Id":"104149","Name":"坪山区"}],"RecommendPositionSort":null,"MetroSort":[{"Id":"155","Name":"5号环中线","EName":"Line 5","Stations":[{"Id":"903","Name":"黄贝岭","EName":"Huangbeiling  "},{"Id":"904","Name":"怡景","EName":"Yijing  "},{"Id":"905","Name":"太安","EName":"Tai'an  "},{"Id":"906","Name":"布心","EName":"Buxin  "},{"Id":"907","Name":"百鸽笼","EName":"Baigelong  "},{"Id":"908","Name":"布吉","EName":"Buji  "},{"Id":"909","Name":"长龙","EName":"Changlong  "},{"Id":"910","Name":"下水径","EName":"Xiashuijing  "},{"Id":"911","Name":"上水径","EName":"Shangshuijing  "},{"Id":"912","Name":"杨美","EName":"Yangmei  "},{"Id":"913","Name":"坂田","EName":"Bantian  "},{"Id":"914","Name":"五和","EName":"Wuhe  "},{"Id":"915","Name":"民治","EName":"Minzhi  "},{"Id":"916","Name":"深圳北站","EName":" Shenzhen North Station  "},{"Id":"917","Name":"长岭陂","EName":"Changlingpi "},{"Id":"918","Name":"塘朗","EName":"Tanglang  "},{"Id":"919","Name":"大学城","EName":"University Town "},{"Id":"920","Name":"西丽","EName":"Xili  "},{"Id":"921","Name":"留仙洞","EName":"Liuxiandong  "},{"Id":"922","Name":"兴东","EName":"Xingdong  "},{"Id":"923","Name":"洪浪北","EName":" Honglang North  "},{"Id":"924","Name":"灵芝","EName":"Lingzhi  "},{"Id":"925","Name":"翻身","EName":"Fanshen "},{"Id":"926","Name":"宝安中心","EName":"Bao'an Center "},{"Id":"927","Name":"宝华","EName":"Baohua "},{"Id":"928","Name":"临海","EName":"Linhai  "},{"Id":"929","Name":"前海湾","EName":"Qianhaiwan  "}]},{"Id":"157","Name":"3号龙岗线","EName":"Line 3","Stations":[{"Id":"946","Name":"双龙","EName":"Shuanglong  "},{"Id":"947","Name":"南联","EName":"Nanlian  "},{"Id":"948","Name":"龙城广场","EName":"Longcheng Square  "},{"Id":"949","Name":"吉祥","EName":"Jixiang  "},{"Id":"950","Name":"爱联","EName":"Ai Lian "},{"Id":"951","Name":"大运","EName":"Universiade "},{"Id":"952","Name":"荷坳","EName":"He Ao "},{"Id":"953","Name":"永湖","EName":"Yonghu  "},{"Id":"954","Name":"横岗","EName":"Heng Gang "},{"Id":"955","Name":"塘坑","EName":"Tangkeng  "},{"Id":"956","Name":"六约","EName":"Liuyue  "},{"Id":"957","Name":"丹竹头","EName":"Danzhutou "},{"Id":"958","Name":"大芬","EName":"Dafen "},{"Id":"959","Name":"木棉湾","EName":"Mumianwan  "},{"Id":"960","Name":"布吉","EName":"Buji "},{"Id":"961","Name":"草埔","EName":"Caopu "},{"Id":"962","Name":"水贝","EName":"Shuibei  "},{"Id":"963","Name":"田贝","EName":"Tianbei  "},{"Id":"964","Name":"翠竹","EName":"Cuizhu "},{"Id":"965","Name":"晒布","EName":"Shaibu  "},{"Id":"966","Name":"老街","EName":"Laojie  "},{"Id":"967","Name":"红岭","EName":" Hongling "},{"Id":"968","Name":"通新岭","EName":"Tongxinling  "},{"Id":"969","Name":"华新","EName":"Huaxin  "},{"Id":"970","Name":"莲花村","EName":"Lianhuacun  "},{"Id":"971","Name":"少年宫","EName":"Shaoniangong  "},{"Id":"972","Name":"福田","EName":"Futian "},{"Id":"973","Name":"购物公园","EName":"COCO Park "},{"Id":"974","Name":"石厦","EName":"Shixia  "},{"Id":"975","Name":"益田","EName":"Yitian  "}]},{"Id":"159","Name":"4号龙华线","EName":"Line 4","Stations":[{"Id":"989","Name":"福田口岸","EName":"Futian Checkpoint "},{"Id":"990","Name":"福民","EName":"Fumin "},{"Id":"991","Name":"会展中心","EName":"Convention & Exhibition Center  "},{"Id":"992","Name":"市民中心","EName":"Civic Center  "},{"Id":"993","Name":"少年宫","EName":"Shaoniangong  "},{"Id":"994","Name":"莲花北","EName":"Lianhua North  "},{"Id":"995","Name":"上梅林","EName":"Shangmeilin  "},{"Id":"996","Name":"民乐","EName":"Minle "},{"Id":"997","Name":"白石龙","EName":"Baishilong "},{"Id":"998","Name":"深圳北站","EName":"Shenzhen North Railway Station "},{"Id":"999","Name":"红山","EName":"Hongshan "},{"Id":"1000","Name":"上塘","EName":"Shangtang "},{"Id":"1001","Name":"龙胜","EName":"Longsheng "},{"Id":"1002","Name":"龙华","EName":"Longhua "},{"Id":"1003","Name":"清湖","EName":"Qinghu "}]},{"Id":"161","Name":"1号罗宝线","EName":"Line 1","Stations":[{"Id":"1020","Name":"机场东","EName":"Airport East "},{"Id":"1021","Name":"后瑞","EName":"Hourui "},{"Id":"1022","Name":"固戍","EName":"Gushu "},{"Id":"1023","Name":"西乡","EName":"Xixiang "},{"Id":"1024","Name":"坪洲","EName":"Pingzhou "},{"Id":"1025","Name":"宝体","EName":"Bao'an Stadium "},{"Id":"1026","Name":"宝安中心","EName":"Bao'an Center "},{"Id":"1027","Name":"新安","EName":"Xin'an "},{"Id":"1028","Name":"前海湾","EName":"Qianhaiwan "},{"Id":"1029","Name":"鲤鱼门","EName":"Liyumen "},{"Id":"1030","Name":"大新","EName":"Daxin "},{"Id":"1031","Name":"桃园","EName":"Taoyuan "},{"Id":"1032","Name":"深大","EName":"Shenzhen University "},{"Id":"1033","Name":"高新园","EName":"Hi-Tech Park "},{"Id":"1034","Name":"白石洲","EName":"Baishizhou "},{"Id":"1035","Name":"世界之窗","EName":"Window of the World "},{"Id":"1036","Name":"华侨城","EName":"Hua Qiao Cheng "},{"Id":"1037","Name":"侨城东","EName":"Qiaocheng East "},{"Id":"1038","Name":"竹子林","EName":"Zhuzilin "},{"Id":"1039","Name":"车公庙","EName":"Chegongmiao "},{"Id":"1040","Name":"香蜜湖","EName":"Xiangmihu "},{"Id":"1041","Name":"购物公园","EName":"COCO Park "},{"Id":"1042","Name":"会展中心","EName":"Convention & Exhibition Center "},{"Id":"1043","Name":"岗厦","EName":"Gangxia "},{"Id":"1044","Name":"华强路","EName":"Huaqiang Lu "},{"Id":"1045","Name":"科学馆","EName":"Kexueguan "},{"Id":"1046","Name":"大剧院","EName":"Grand Theater "},{"Id":"1047","Name":"老街","EName":"Lao Jie "},{"Id":"1048","Name":"国贸","EName":"Guomao "},{"Id":"1049","Name":"罗湖","EName":"Luo Hu "}]},{"Id":"163","Name":"2号蛇口线","EName":"Line 2","Stations":[{"Id":"1074","Name":"赤湾","EName":"Chiwan "},{"Id":"1075","Name":"蛇口港","EName":"Shekou Port "},{"Id":"1076","Name":"海上世界","EName":"Sea World "},{"Id":"1077","Name":"水湾","EName":"Shuiwan "},{"Id":"1078","Name":"东角头","EName":"Dongjiaotou "},{"Id":"1079","Name":"湾厦","EName":"Wanxia "},{"Id":"1080","Name":"海月","EName":"Haiyue "},{"Id":"1081","Name":"登良","EName":"Dengliang "},{"Id":"1082","Name":"后海","EName":"Houhai "},{"Id":"1083","Name":"科苑","EName":"Keyuan "},{"Id":"1084","Name":"红树湾","EName":"Hongshuwan "},{"Id":"1085","Name":"世界之窗","EName":"Window of the World "},{"Id":"1086","Name":"侨城北","EName":"Qiaocheng North "},{"Id":"1087","Name":"深康","EName":"Shenkang "},{"Id":"1088","Name":"安托山","EName":"Antuoshan "},{"Id":"1089","Name":"侨香","EName":"Qiaoxiang "},{"Id":"1090","Name":"香蜜","EName":"Xiangmi "},{"Id":"1091","Name":"香梅北","EName":"Xiangmei North "},{"Id":"1092","Name":"景田","EName":"Jingtian "},{"Id":"1093","Name":"莲花西","EName":"Lianhua West "},{"Id":"1094","Name":"福田","EName":"Futian "},{"Id":"1095","Name":"市民中心","EName":"Civic Center "},{"Id":"1096","Name":"岗厦北","EName":"Gangxia North "},{"Id":"1097","Name":"华强北","EName":"Huaqiang North "},{"Id":"1098","Name":"燕南","EName":"Yannan "},{"Id":"1099","Name":"大剧院","EName":"Grand Theater "},{"Id":"1100","Name":"湖贝","EName":"Hubei "},{"Id":"1101","Name":"黄贝岭","EName":"Huangbeiling "},{"Id":"1102","Name":"新秀","EName":"Xinxiu "}]},{"Id":"605","Name":"9号线","EName":"","Stations":[{"Id":"20338","Name":"文锦","EName":""},{"Id":"20339","Name":"向西村","EName":""},{"Id":"20340","Name":"人民南","EName":""},{"Id":"20341","Name":"鹿丹村","EName":""},{"Id":"20342","Name":"红岭南","EName":""},{"Id":"20343","Name":"红岭","EName":""},{"Id":"20344","Name":"园岭","EName":""},{"Id":"20345","Name":"红岭北","EName":""},{"Id":"20346","Name":"泥岗","EName":""},{"Id":"20347","Name":"银湖","EName":""},{"Id":"20348","Name":"孖岭","EName":""},{"Id":"20349","Name":"上梅林","EName":""},{"Id":"20350","Name":"梅村","EName":""},{"Id":"20351","Name":"下梅林","EName":""},{"Id":"20352","Name":"梅景","EName":""},{"Id":"20353","Name":"景田","EName":""},{"Id":"20354","Name":"香梅","EName":""},{"Id":"20355","Name":"车公庙","EName":""},{"Id":"20356","Name":"下沙","EName":""},{"Id":"20307","Name":"深圳湾公园","EName":""},{"Id":"20308","Name":"深湾","EName":""},{"Id":"20309","Name":"红树湾南","EName":""}]},{"Id":"606","Name":"7号线","EName":"","Stations":[{"Id":"20327","Name":"上沙","EName":""},{"Id":"20328","Name":"车公庙","EName":""},{"Id":"20329","Name":"农林","EName":"Nonglin"},{"Id":"20330","Name":"安托山","EName":""},{"Id":"20331","Name":"深云","EName":""},{"Id":"20332","Name":"桃源村","EName":""},{"Id":"20333","Name":"龙井","EName":""},{"Id":"20334","Name":"珠光","EName":""},{"Id":"20335","Name":"茶光","EName":""},{"Id":"20336","Name":"西丽","EName":""},{"Id":"20337","Name":"西丽湖","EName":""},{"Id":"20310","Name":"太安","EName":""},{"Id":"20311","Name":"田贝","EName":""},{"Id":"20312","Name":"洪湖","EName":""},{"Id":"20313","Name":"笋岗","EName":""},{"Id":"20314","Name":"红岭北","EName":""},{"Id":"20315","Name":"八卦岭","EName":""},{"Id":"20316","Name":"黄木岗","EName":""},{"Id":"20317","Name":"华新","EName":""},{"Id":"20318","Name":"华强北","EName":""},{"Id":"20319","Name":"华强南","EName":""},{"Id":"20320","Name":"赤尾","EName":""},{"Id":"20321","Name":"福邻（暂未开通）","EName":""},{"Id":"20322","Name":"皇岗口岸","EName":""},{"Id":"20323","Name":"福民","EName":""},{"Id":"20324","Name":"皇岗村","EName":""},{"Id":"20325","Name":"石厦","EName":""},{"Id":"20326","Name":"沙尾","EName":""}]},{"Id":"607","Name":"11号线","EName":"","Stations":[{"Id":"20289","Name":"碧头","EName":""},{"Id":"20290","Name":"松岗","EName":""},{"Id":"20291","Name":"后亭","EName":""},{"Id":"20292","Name":"沙井","EName":""},{"Id":"20293","Name":"马安山","EName":""},{"Id":"20294","Name":"塘尾","EName":""},{"Id":"20295","Name":"桥头","EName":""},{"Id":"20296","Name":"福永","EName":""},{"Id":"20297","Name":"机场北","EName":""},{"Id":"20298","Name":"机场","EName":""},{"Id":"20299","Name":"碧海湾","EName":""},{"Id":"20300","Name":"宝安","EName":""},{"Id":"20301","Name":"前海湾","EName":""},{"Id":"20302","Name":"南山","EName":"Nanshan"},{"Id":"20303","Name":"后海","EName":""},{"Id":"20304","Name":"红树湾南","EName":""},{"Id":"20305","Name":"车公庙","EName":""},{"Id":"20306","Name":"福田","EName":""}]}]}
     * MeiShiLinLinkImg : https://youimg1.c-ctrip.com/target/100v0i0000009i64gD6E9.jpg
     * IsInTravel : false
     * Restaurants : [{"RestaurantId":5171894,"PoiId":11321595,"Name":"利苑酒家(宝安南路店)","BookingText":"386人已预订","PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.542717,"Lon":114.10553,"GGCoord":{"Lat":22.542717,"Lng":114.10553,"MapImageUrl":null},"BCoord":{"Lat":22.548962629169534,"Lng":114.11196544146,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/100a0y000000lxrdi1BAE_D_265_265_Q90.jpg","AveragePrice":392,"CurrencyUnit":"RMB","CommentScore":"4.5","CommentCount":44,"RecommendedTag":null,"Distance":null,"DistanceNum":5.24276751421506,"TagNameList":["早茶"],"IsBook":true,"IsHaveProduct":false,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/100a0y000000lxrdi1BAE_D_100_100_Q90.jpg","Feature":"深色系装潢稳重大气，精致佳肴各有千秋。","RankingNum":null,"ShiMeiLinName":"美食林一星","ShiMeiLinType":3,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":"荔枝公园","LandmarkDistance":"501m","CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":"万象城/京基100","SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"粤菜","HaveDiscountCard":null,"DistrictCentreDistance":"5.2km","IsSupportQueue":false,"DistanceDesc":"距市中心5.2km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"深圳必吃粤菜第5名","UgcComment":"\u201c擅长粤菜和港式点心\u201d","IsHaveVideo":false,"BookingProductType":"51","BookingProductId":"2037272","GrouponDesc":null,"UgcCommentList":["\u201c粤菜着名餐馆，菜品精致，味道赞\u201d","\u201c鲍汁凤爪，非常软糯，满满的胶原蛋白\u201d","\u201c深圳和广州最出名的粤菜之一\u201d","\u201c本人钟爱虾饺皇\u201d","\u201c擅长粤菜和港式点心\u201d"],"BookingTexts":["建议提前1天预订","386人已预订"]},{"RestaurantId":5175173,"PoiId":11324887,"Name":"瑞吉酒店-Elba欧尔巴意大利餐厅","BookingText":"514人已预订","PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.543158,"Lon":114.10672,"GGCoord":{"Lat":22.543158,"Lng":114.10672,"MapImageUrl":null},"BCoord":{"Lat":22.549417853623286,"Lng":114.11315292580711,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/10010y000000m9d8c78CF_D_265_265_Q90.jpg","AveragePrice":1031,"CurrencyUnit":"RMB","CommentScore":"4.6","CommentCount":19,"RecommendedTag":null,"Distance":null,"DistanceNum":5.3735040532228044,"TagNameList":["景观餐厅"],"IsBook":true,"IsHaveProduct":true,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/10010y000000m9d8c78CF_D_100_100_Q90.jpg","Feature":"威尼斯风格的意式餐厅，窗外尽览深圳美景。","RankingNum":null,"ShiMeiLinName":"美食林一星","ShiMeiLinType":3,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":"地王观光","LandmarkDistance":"473m","CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":"万象城/京基100","SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"西餐","HaveDiscountCard":null,"DistrictCentreDistance":"5.4km","IsSupportQueue":false,"DistanceDesc":"距市中心5.4km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"深圳纪念日精选第7名","UgcComment":"\u201c风景视野独一无二\u201d","IsHaveVideo":false,"BookingProductType":"53","BookingProductId":"2085321","GrouponDesc":"欧尔巴餐厅全新商务午餐","UgcCommentList":["\u201c与美味的意大利菜式相得益彰\u201d","\u201c环境很棒正餐是烧牛肉、香煎鲈鱼、意式羊肉\u201d","\u201c三、提供款式丰富的高品质葡萄酒搭配\u201d","\u201c味道都很棒\u201d","\u201c风景视野独一无二\u201d"],"BookingTexts":["建议提前预订","514人已预订"]},{"RestaurantId":5169366,"PoiId":11318990,"Name":"香港新发烧腊茶餐厅(凤凰路店)","BookingText":null,"PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.547901,"Lon":114.133698,"GGCoord":{"Lat":22.547901,"Lng":114.133698,"MapImageUrl":null},"BCoord":{"Lat":22.55415674980566,"Lng":114.14013540630786,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/fd/tg/g6/M03/23/C8/CggYs1dAgOSAbANVAACLooHufdM167_D_265_265_Q90.jpg","AveragePrice":67,"CurrencyUnit":"RMB","CommentScore":"4.5","CommentCount":546,"RecommendedTag":null,"Distance":null,"DistanceNum":8.357795651683663,"TagNameList":["深夜营业"],"IsBook":false,"IsHaveProduct":false,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/fd/tg/g6/M03/23/C8/CggYs1dAgOSAbANVAACLooHufdM167_D_100_100_Q90.jpg","Feature":"人气超旺的茶餐厅，蜜汁烧腊甜而不腻。","RankingNum":null,"ShiMeiLinName":"美食林风味","ShiMeiLinType":5,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":null,"LandmarkDistance":null,"CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":"东门商业区","SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"粤菜","HaveDiscountCard":null,"DistrictCentreDistance":"8.4km","IsSupportQueue":false,"DistanceDesc":"距市中心8.4km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"深圳美食人气榜第18名","UgcComment":"\u201c港式茶餐厅，味道正宗，柠檬茶和奶茶好饮\u201d","IsHaveVideo":false,"BookingProductType":null,"BookingProductId":null,"GrouponDesc":null,"UgcCommentList":["\u201c烧腊为香港和广东人最爱的系列之一\u201d","\u201c港式茶餐厅曾经是遍地开花\u201d","\u201c味道很棒，地道的香港茶餐厅口味\u201d","\u201c挺喜欢茶餐厅的\u201d","\u201c港式茶餐厅，味道正宗，柠檬茶和奶茶好饮\u201d"],"BookingTexts":null},{"RestaurantId":234735,"PoiId":269465,"Name":"大林苑精细中国菜","BookingText":"269人已预订","PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.557035,"Lon":114.138649,"GGCoord":{"Lat":22.557036,"Lng":114.138649,"MapImageUrl":null},"BCoord":{"Lat":22.563214,"Lng":114.1451,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/10070y000000md5ok437A_D_265_265_Q90.jpg","AveragePrice":727,"CurrencyUnit":"RMB","CommentScore":"4.6","CommentCount":38,"RecommendedTag":null,"Distance":null,"DistanceNum":9.01699105514213,"TagNameList":["张新民推荐","明星主厨"],"IsBook":true,"IsHaveProduct":false,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/10070y000000md5ok437A_D_100_100_Q90.jpg","Feature":"精细潮州菜的鼻祖，由现代潮菜之父创立。","RankingNum":null,"ShiMeiLinName":"美食林一星","ShiMeiLinType":3,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":null,"LandmarkDistance":null,"CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":"东门商业区","SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"粤菜","HaveDiscountCard":null,"DistrictCentreDistance":"9km","IsSupportQueue":false,"DistanceDesc":"距市中心9km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":null,"UgcComment":"\u201c炸虾枣粿肉\u201d","IsHaveVideo":false,"BookingProductType":"51","BookingProductId":"2037294","GrouponDesc":null,"UgcCommentList":["\u201c炸百合，必点菜品，很香，很脆\u201d","\u201c豆酱焗红花桃、粿肉等若干小菜做的也够精细\u201d","\u201c提供地道精致的粤菜\u201d","\u201c豆酱焗红花桃、粿肉等若干小菜做的精细\u201d","\u201c炸虾枣粿肉\u201d"],"BookingTexts":["建议提前预订","269人已预订"]},{"RestaurantId":5186724,"PoiId":11336439,"Name":"四季酒店·卓粤轩","BookingText":"491人已预订","PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.533543,"Lon":114.057953,"GGCoord":{"Lat":22.533543,"Lng":114.057953,"MapImageUrl":null},"BCoord":{"Lat":22.539198979801004,"Lng":114.0645009280869,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/100k0y000000m0mhq4F26_D_265_265_Q90.jpg","AveragePrice":562,"CurrencyUnit":"RMB","CommentScore":"4.7","CommentCount":55,"RecommendedTag":null,"Distance":null,"DistanceNum":1.0510896533596676,"TagNameList":["早茶"],"IsBook":true,"IsHaveProduct":true,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/100k0y000000m0mhq4F26_D_100_100_Q90.jpg","Feature":"低奢装潢彰显品味，菜品精致饱含粤菜特色。","RankingNum":null,"ShiMeiLinName":"美食林一星","ShiMeiLinType":3,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":"福田站","LandmarkDistance":"576m","CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":null,"SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"粤菜","HaveDiscountCard":null,"DistrictCentreDistance":"1.1km","IsSupportQueue":false,"DistanceDesc":"距市中心1.1km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"深圳必吃粤菜第4名","UgcComment":"\u201c粤菜里面常见的生勐海鲜\u201d","IsHaveVideo":false,"BookingProductType":"51","BookingProductId":"2037262","GrouponDesc":null,"UgcCommentList":["\u201c堪称很典型的粤菜神韵\u201d","\u201c粤菜的时尚潮流曾经依赖于香港厨师的推动\u201d","\u201c黑松露春卷\u201d","\u201c粤菜很正宗\u201d","\u201c粤菜里面常见的生勐海鲜\u201d"],"BookingTexts":["建议提前预订","491人已预订"]},{"RestaurantId":15319454,"PoiId":30812547,"Name":"植藤·匠日本料理","BookingText":"535人已预订","PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.517483,"Lon":113.933258,"GGCoord":{"Lat":22.517314,"Lng":113.933797,"MapImageUrl":null},"BCoord":{"Lat":22.523243,"Lng":113.939827,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/100k0y000000m0nxc338B_D_265_265_Q90.jpg","AveragePrice":1134,"CurrencyUnit":"RMB","CommentScore":"4.7","CommentCount":31,"RecommendedTag":null,"Distance":null,"DistanceNum":13.939619084411452,"TagNameList":["景观餐厅","明星主厨"],"IsBook":true,"IsHaveProduct":false,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/100k0y000000m0nxc338B_D_100_100_Q90.jpg","Feature":"日式装潢清爽简约，优质食材呈现上乘口感。","RankingNum":null,"ShiMeiLinName":"美食林一星","ShiMeiLinType":3,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":null,"LandmarkDistance":null,"CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":null,"SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"日本料理","HaveDiscountCard":null,"DistrictCentreDistance":"13.9km","IsSupportQueue":false,"DistanceDesc":"距市中心13.9km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"深圳纪念日精选第1名","UgcComment":"\u201c「鳗鱼饭」独特的关西做法\u201d","IsHaveVideo":false,"BookingProductType":"51","BookingProductId":"2010759","GrouponDesc":null,"UgcCommentList":["\u201c日本料理一向都以贵为特点\u201d","\u201c植藤日本料理\u201c忠呈于\u201d","\u201c鹅肝鱼子酱蒸蛋味道一级棒\u201d","\u201c香喷喷的蒸蛋搭配脆脆的鹅肝\u201d","\u201c「鳗鱼饭」独特的关西做法\u201d"],"BookingTexts":["建议提前预订","535人已预订"]},{"RestaurantId":223951,"PoiId":258681,"Name":"丹桂轩(新都店)","BookingText":"285人已预订","PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.536001,"Lon":114.118423,"GGCoord":{"Lat":22.536001,"Lng":114.118423,"MapImageUrl":null},"BCoord":{"Lat":22.542338503632628,"Lng":114.1248369614176,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/100n0t000000ippz62263_D_265_265_Q90.jpg","AveragePrice":154,"CurrencyUnit":"RMB","CommentScore":"4.5","CommentCount":203,"RecommendedTag":null,"Distance":null,"DistanceNum":6.70642243955891,"TagNameList":["早茶"],"IsBook":true,"IsHaveProduct":false,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/100n0t000000ippz62263_D_100_100_Q90.jpg","Feature":"餐厅环境舒适高雅，菜品精致，颇受欢迎。","RankingNum":null,"ShiMeiLinName":"美食林臻选","ShiMeiLinType":4,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":"深圳站","LandmarkDistance":"488m","CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":"罗湖口岸/火车站","SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"粤菜","HaveDiscountCard":null,"DistrictCentreDistance":"6.7km","IsSupportQueue":false,"DistanceDesc":"距市中心6.7km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"深圳美食人气榜第5名","UgcComment":"\u201c牛仔骨还有荷叶鲜虾饭都非常不错\u201d","IsHaveVideo":false,"BookingProductType":"51","BookingProductId":"2037288","GrouponDesc":null,"UgcCommentList":["\u201c菜品味道很正粤菜系\u201d","\u201c以粤菜为主，菜品很精致，人气火爆\u201d","\u201c本身在深圳也算是经典的粤菜馆之一了\u201d","\u201c粤菜中的烧鹅、海味、烧腊、卤味都很地道\u201d","\u201c牛仔骨还有荷叶鲜虾饭都非常不错\u201d"],"BookingTexts":["建议提前3天预订","285人已预订"]},{"RestaurantId":223368,"PoiId":258098,"Name":"金皇廷","BookingText":"425人已预订","PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.534031,"Lon":114.062759,"GGCoord":{"Lat":22.534031,"Lng":114.062759,"MapImageUrl":null},"BCoord":{"Lat":22.539688585805077,"Lng":114.06930671204734,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/100p0t000000ipt7aDFA6_D_265_265_Q90.jpg","AveragePrice":112,"CurrencyUnit":"RMB","CommentScore":"4.6","CommentCount":241,"RecommendedTag":null,"Distance":null,"DistanceNum":1.133121794425052,"TagNameList":["早茶"],"IsBook":true,"IsHaveProduct":false,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/100p0t000000ipt7aDFA6_D_100_100_Q90.jpg","Feature":"轻奢装潢宛如欧式宫殿，地道粤菜入口惊艳。","RankingNum":null,"ShiMeiLinName":"美食林臻选","ShiMeiLinType":4,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":"福田站","LandmarkDistance":"815m","CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":null,"SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"粤菜","HaveDiscountCard":null,"DistrictCentreDistance":"1.1km","IsSupportQueue":false,"DistanceDesc":"距市中心1.1km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"深圳精致一人食第3名","UgcComment":"\u201c那个虾饺皇皮是透明的\u201d","IsHaveVideo":false,"BookingProductType":"51","BookingProductId":"2037312","GrouponDesc":null,"UgcCommentList":["\u201c虾饺皇搭配饱满猪肉\u201d","\u201c榴莲酥味道很正，很厚实一坨榴莲，超级香\u201d","\u201c红烧乳鸽两只，皮脆肉香，味道很赞\u201d","\u201c榴莲酥味道很正\u201d","\u201c那个虾饺皇皮是透明的\u201d"],"BookingTexts":["建议提前4小时预订","425人已预订"]},{"RestaurantId":15296889,"PoiId":30554871,"Name":"陈鹏鹏卤鹅饭店(欢乐海岸店)","BookingText":null,"PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.530775,"Lon":113.998688,"GGCoord":{"Lat":22.530775,"Lng":113.998688,"MapImageUrl":null},"BCoord":{"Lat":22.537112314645,"Lng":114.005100962289,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/100f1f000001gn8g06A50_D_265_265_Q90.jpg","AveragePrice":115,"CurrencyUnit":"RMB","CommentScore":"4.6","CommentCount":286,"RecommendedTag":null,"Distance":null,"DistanceNum":6.6496482599676074,"TagNameList":["明星主厨"],"IsBook":false,"IsHaveProduct":false,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/100f1f000001gn8g06A50_D_100_100_Q90.jpg","Feature":"蔡澜推荐的卤鹅馆，荣获多个美食奖项。","RankingNum":null,"ShiMeiLinName":"美食林臻选","ShiMeiLinType":4,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":"园博园","LandmarkDistance":"460m","CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":null,"SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"粤菜","HaveDiscountCard":null,"DistrictCentreDistance":"6.5km","IsSupportQueue":false,"DistanceDesc":"距市中心6.5km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"深圳美食人气榜第4名","UgcComment":"\u201c鹅肝很细腻，很赞\u201d","IsHaveVideo":false,"BookingProductType":null,"BookingProductId":null,"GrouponDesc":null,"UgcCommentList":["\u201c鹅肝肥美柔软\u201d","\u201c鹅肉很鲜味道很正\u201d","\u201c鹅肉味道很好\u201d","\u201c鹅肉入味肥美，配以一盘青菜清清口\u201d","\u201c鹅肝很细腻，很赞\u201d"],"BookingTexts":null},{"RestaurantId":8637418,"PoiId":17003579,"Name":"蚝门九式(南山店)","BookingText":"302人已预订","PriceDesc":null,"SecondName":null,"DistrictId":26,"Lat":22.488531,"Lon":113.924149,"GGCoord":{"Lat":22.488531,"Lng":113.924149,"MapImageUrl":null},"BCoord":{"Lat":22.49430252364431,"Lng":113.93070562023611,"MapImageUrl":null},"ImageUrl":"https://youimg1.c-ctrip.com/target/100d0y000000luz7x7D9A_D_265_265_Q90.jpg","AveragePrice":266,"CurrencyUnit":"RMB","CommentScore":"4.4","CommentCount":112,"RecommendedTag":null,"Distance":null,"DistanceNum":15.886857659492774,"TagNameList":[],"IsBook":true,"IsHaveProduct":false,"IsPromotion":false,"RecommandType":1,"ImageUrl2":"https://youimg1.c-ctrip.com/target/100d0y000000luz7x7D9A_D_100_100_Q90.jpg","Feature":"颇受美食家青睐的蚝餐厅，肉质肥美鲜嫩。","RankingNum":null,"ShiMeiLinName":"美食林一星","ShiMeiLinType":3,"IsHaveHotelProduct":false,"AdLabelImgUrl":null,"LandmarkName":"海上世界","LandmarkDistance":"994m","CtripExcellent":null,"LocalCurrency":null,"LocalPrice":null,"MeiShiLinChainTypeName":null,"OpenStatus":null,"ZoneName":null,"SearchHitType":null,"SearchHitWord":null,"KoubeiAmount":null,"DistrictName":null,"LinkUrl":null,"InChina":true,"IsOversea":false,"CuisineName":"粤菜","HaveDiscountCard":null,"DistrictCentreDistance":"15.9km","IsSupportQueue":false,"DistanceDesc":"距市中心15.9km","RelateHotelName":null,"HotelCheckinStatus":null,"InDistrict":true,"Coupon":null,"IsFavourite":null,"BigRankingNo":"2019精选榜","SmallRankingNo":"入选深圳美食人气榜","UgcComment":"\u201c正宗海鲜大餐\u201d","IsHaveVideo":false,"BookingProductType":"51","BookingProductId":"2037282","GrouponDesc":null,"UgcCommentList":["\u201c冰镇生蚝、芥末炒蚝\u201d","\u201c金丝生蚝、葱姜炒蚝\u201d","\u201c各种海鲜河鲜都比较新鲜\u201d","\u201c海鲜都是每天运来的，很新鲜，款式多\u201d","\u201c正宗海鲜大餐\u201d"],"BookingTexts":["建议提前预订","302人已预订"]}]
     * ResponseStatus : {"Timestamp":"/Date(1591610671016+0800)/","Ack":"Success","Errors":[],"Build":null,"Version":null,"Extension":[{"Id":"CLOGGING_TRACE_ID","Version":null,"ContentType":null,"Value":"7912596765557138411"},{"Id":"RootMessageId","Version":null,"ContentType":null,"Value":"921812-0a3c877d-442114-304739"}]}
     */

    private int TotalCount;
    private DistrictBean District;
    private boolean IsShowSwitcher;
    private String ABTestVersion;
    private int BrowseVersion;
    private Object Shops;
    private Object RecommendDistricts;
    private FilterBean Filter;
    private String MeiShiLinLinkImg;
    private boolean IsInTravel;
    private ResponseStatusBean ResponseStatus;
    private List<CustomFilterBean> CustomFilter;
    private List<RestaurantsBean> Restaurants;

    public static TabFood objectFromData(String str) {

        return new Gson().fromJson(str, TabFood.class);
    }

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int TotalCount) {
        this.TotalCount = TotalCount;
    }

    public DistrictBean getDistrict() {
        return District;
    }

    public void setDistrict(DistrictBean District) {
        this.District = District;
    }

    public boolean isIsShowSwitcher() {
        return IsShowSwitcher;
    }

    public void setIsShowSwitcher(boolean IsShowSwitcher) {
        this.IsShowSwitcher = IsShowSwitcher;
    }

    public String getABTestVersion() {
        return ABTestVersion;
    }

    public void setABTestVersion(String ABTestVersion) {
        this.ABTestVersion = ABTestVersion;
    }

    public int getBrowseVersion() {
        return BrowseVersion;
    }

    public void setBrowseVersion(int BrowseVersion) {
        this.BrowseVersion = BrowseVersion;
    }

    public Object getShops() {
        return Shops;
    }

    public void setShops(Object Shops) {
        this.Shops = Shops;
    }

    public Object getRecommendDistricts() {
        return RecommendDistricts;
    }

    public void setRecommendDistricts(Object RecommendDistricts) {
        this.RecommendDistricts = RecommendDistricts;
    }

    public FilterBean getFilter() {
        return Filter;
    }

    public void setFilter(FilterBean Filter) {
        this.Filter = Filter;
    }

    public String getMeiShiLinLinkImg() {
        return MeiShiLinLinkImg;
    }

    public void setMeiShiLinLinkImg(String MeiShiLinLinkImg) {
        this.MeiShiLinLinkImg = MeiShiLinLinkImg;
    }

    public boolean isIsInTravel() {
        return IsInTravel;
    }

    public void setIsInTravel(boolean IsInTravel) {
        this.IsInTravel = IsInTravel;
    }

    public ResponseStatusBean getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(ResponseStatusBean ResponseStatus) {
        this.ResponseStatus = ResponseStatus;
    }

    public List<CustomFilterBean> getCustomFilter() {
        return CustomFilter;
    }

    public void setCustomFilter(List<CustomFilterBean> CustomFilter) {
        this.CustomFilter = CustomFilter;
    }

    public List<RestaurantsBean> getRestaurants() {
        return Restaurants;
    }

    public void setRestaurants(List<RestaurantsBean> Restaurants) {
        this.Restaurants = Restaurants;
    }

    public static class DistrictBean {
        /**
         * DistrictId : 26
         * DistrictName : 深圳
         * EName : Shenzhen
         * InChina : true
         * IsOversea : false
         * ParentDistrictId : 0
         */

        private int DistrictId;
        private String DistrictName;
        private String EName;
        private boolean InChina;
        private boolean IsOversea;
        private int ParentDistrictId;

        public static DistrictBean objectFromData(String str) {

            return new Gson().fromJson(str, DistrictBean.class);
        }

        public int getDistrictId() {
            return DistrictId;
        }

        public void setDistrictId(int DistrictId) {
            this.DistrictId = DistrictId;
        }

        public String getDistrictName() {
            return DistrictName;
        }

        public void setDistrictName(String DistrictName) {
            this.DistrictName = DistrictName;
        }

        public String getEName() {
            return EName;
        }

        public void setEName(String EName) {
            this.EName = EName;
        }

        public boolean isInChina() {
            return InChina;
        }

        public void setInChina(boolean InChina) {
            this.InChina = InChina;
        }

        public boolean isIsOversea() {
            return IsOversea;
        }

        public void setIsOversea(boolean IsOversea) {
            this.IsOversea = IsOversea;
        }

        public int getParentDistrictId() {
            return ParentDistrictId;
        }

        public void setParentDistrictId(int ParentDistrictId) {
            this.ParentDistrictId = ParentDistrictId;
        }
    }

    public static class FilterBean {
        /**
         * LandmarkSort : [{"Id":8370,"Name":"东门老街","Lat":22.545400619506836,"Lon":114.11900329589844},{"Id":11443,"Name":"福田站","Lat":22.538700103759766,"Lon":114.05699920654297},{"Id":10872,"Name":"宝安国际机场","Lat":22.62540054321289,"Lon":113.81300354003906},{"Id":8360,"Name":"世界之窗","Lat":22.53459930419922,"Lon":113.9729995727539},{"Id":8380,"Name":"深圳湾公园","Lat":22.504100799560547,"Lon":113.9530029296875},{"Id":11243,"Name":"深圳北站","Lat":22.60919952392578,"Lon":114.02899932861328},{"Id":11863,"Name":"蛇口站","Lat":22.48040008544922,"Lon":113.89900207519531},{"Id":8364,"Name":"地王观光","Lat":22.542699813842773,"Lon":114.11100006103516},{"Id":8367,"Name":"东部华侨城","Lat":22.626699447631836,"Lon":114.28800201416016},{"Id":8368,"Name":"深圳欢乐海岸","Lat":22.523399353027344,"Lon":113.98799896240234},{"Id":8372,"Name":"小梅沙海洋世界","Lat":22.60449981689453,"Lon":114.3290023803711},{"Id":8373,"Name":"仙湖植物园","Lat":22.57859992980957,"Lon":114.17500305175781},{"Id":8378,"Name":"深圳市民中心","Lat":22.54360008239746,"Lon":114.05999755859375},{"Id":8381,"Name":"大梅沙海滨公园","Lat":22.59239959716797,"Lon":114.30799865722656},{"Id":8382,"Name":"华强北路","Lat":22.546300888061523,"Lon":114.08699798583984},{"Id":8384,"Name":"沙头角中英街","Lat":22.541799545288086,"Lon":114.23100280761719},{"Id":8385,"Name":"大芬油画村","Lat":22.609600067138672,"Lon":114.13600158691406},{"Id":8389,"Name":"羊台山森林公园","Lat":22.651399612426758,"Lon":113.96499633789062},{"Id":10599,"Name":"甘坑客家小镇","Lat":22.654499053955078,"Lon":114.10600280761719},{"Id":11081,"Name":"深圳西站","Lat":22.528400421142578,"Lon":113.90799713134766},{"Id":8361,"Name":"深圳欢乐谷","Lat":22.54159927368164,"Lon":113.98100280761719},{"Id":8362,"Name":"锦绣中华民俗文化村","Lat":22.5310001373291,"Lon":113.98799896240234},{"Id":8363,"Name":"深圳野生动物园","Lat":22.598899841308594,"Lon":113.97200012207031},{"Id":8365,"Name":"莲花山公园","Lat":22.553499221801758,"Lon":114.05899810791016},{"Id":8366,"Name":"红树林","Lat":22.52440071105957,"Lon":114.01300048828125},{"Id":8369,"Name":"欢乐海岸海洋奇梦馆","Lat":22.52549934387207,"Lon":113.98899841308594},{"Id":8371,"Name":"青青世界","Lat":22.50029945373535,"Lon":113.9010009765625},{"Id":8374,"Name":"园博园","Lat":22.534900665283203,"Lon":113.99800109863281},{"Id":8375,"Name":"观澜山水田园旅游文化园","Lat":22.714099884033203,"Lon":114.10700225830078},{"Id":8376,"Name":"海上世界","Lat":22.482999801635742,"Lon":113.91699981689453},{"Id":8377,"Name":"罗湖口岸","Lat":22.527999877929688,"Lon":114.11900329589844},{"Id":8379,"Name":"东部华侨城大侠谷","Lat":22.618799209594727,"Lon":114.28800201416016},{"Id":8383,"Name":"荷兰花卉小镇","Lat":22.54290008544922,"Lon":113.91000366210938},{"Id":8386,"Name":"东部华侨城茶溪谷","Lat":22.63129997253418,"Lon":114.28199768066406},{"Id":8388,"Name":"荔枝公园","Lat":22.54560089111328,"Lon":114.10199737548828},{"Id":11080,"Name":"深圳东站","Lat":22.60219955444336,"Lon":114.12000274658203},{"Id":11082,"Name":"深圳站","Lat":22.53179931640625,"Lon":114.11699676513672},{"Id":11242,"Name":"坂田站","Lat":22.62470054626465,"Lon":114.0530014038086},{"Id":11351,"Name":"光明城站","Lat":22.732900619506836,"Lon":113.9540023803711},{"Id":11357,"Name":"深圳坪山站","Lat":22.707700729370117,"Lon":114.3270034790039},{"Id":11517,"Name":"平湖站","Lat":22.69230079650879,"Lon":114.125},{"Id":11757,"Name":"布吉站","Lat":22.601699829101562,"Lon":114.12200164794922}]
         * ZoneSort : [{"ZoneId":19211009,"ZoneName":"体育中心"},{"ZoneId":19997051,"ZoneName":"深圳国际会展中心商圈"},{"ZoneId":21130364,"ZoneName":"坑梓商业区"},{"ZoneId":126,"ZoneName":"华侨城"},{"ZoneId":127,"ZoneName":"深圳湾口岸/蛇口"},{"ZoneId":128,"ZoneName":"会展中心/CBD"},{"ZoneId":157,"ZoneName":"华强北商业区"},{"ZoneId":159,"ZoneName":"东门商业区"},{"ZoneId":320,"ZoneName":"大小梅沙/东部华侨城"},{"ZoneId":723,"ZoneName":"宝安商业区"},{"ZoneId":724,"ZoneName":"龙岗中心区/大运新城"},{"ZoneId":995,"ZoneName":"坪山高铁站商圈"},{"ZoneId":996,"ZoneName":"光明农场商圈"},{"ZoneId":997,"ZoneName":"盐田区政府/沙头角"},{"ZoneId":998,"ZoneName":"南澳"},{"ZoneId":999,"ZoneName":"布吉/深圳东站"},{"ZoneId":1000,"ZoneName":"松岗商业中心区"},{"ZoneId":1001,"ZoneName":"深圳北站地区"},{"ZoneId":1002,"ZoneName":"宝安机场"},{"ZoneId":1006,"ZoneName":"科技园"},{"ZoneId":1008,"ZoneName":"公明广场商圈"},{"ZoneId":1010,"ZoneName":"罗湖口岸/火车站"},{"ZoneId":1011,"ZoneName":"海岸城/后海"},{"ZoneId":12157,"ZoneName":"万象城/京基100"},{"ZoneId":12158,"ZoneName":"罗湖体育馆/梧桐山风景区"},{"ZoneId":12159,"ZoneName":"皇岗口岸/福田口岸"},{"ZoneId":12160,"ZoneName":"大学城/西丽动物园"},{"ZoneId":12161,"ZoneName":"坂田"},{"ZoneId":12162,"ZoneName":"观澜"},{"ZoneId":12163,"ZoneName":"葵涌/官湖商圈"},{"ZoneId":12164,"ZoneName":"较场尾/大鹏所城"},{"ZoneId":12165,"ZoneName":"杨梅坑/桔钓沙"},{"ZoneId":12166,"ZoneName":"东涌/西涌"},{"ZoneId":14726,"ZoneName":"田贝/水贝珠宝城"},{"ZoneId":14727,"ZoneName":"笋岗/八卦岭"},{"ZoneId":14728,"ZoneName":"莲花山/梅林"},{"ZoneId":14729,"ZoneName":"平湖/华南城"},{"ZoneId":14744,"ZoneName":"石岩"}]
         * DistanceSort : null
         * CuisineSort : [{"Id":10000001,"Name":"地方菜","Children":[{"Id":10000001,"Name":"全部","Children":null},{"Id":4898,"Name":"粤菜","Children":null},{"Id":4915,"Name":"湘菜","Children":null},{"Id":4896,"Name":"川菜","Children":null},{"Id":4897,"Name":"江浙菜","Children":null},{"Id":4909,"Name":"本帮菜","Children":null},{"Id":4924,"Name":"东北菜","Children":null},{"Id":4939,"Name":"客家菜","Children":null},{"Id":4923,"Name":"西北菜","Children":null},{"Id":4899,"Name":"北京菜","Children":null},{"Id":4919,"Name":"云南菜","Children":null},{"Id":4925,"Name":"新疆菜","Children":null},{"Id":4913,"Name":"湖北菜","Children":null},{"Id":4911,"Name":"徽菜","Children":null},{"Id":4926,"Name":"海南菜","Children":null},{"Id":4917,"Name":"台湾菜","Children":null},{"Id":4914,"Name":"贵州菜","Children":null},{"Id":4912,"Name":"江西菜","Children":null},{"Id":4916,"Name":"闽菜","Children":null},{"Id":4918,"Name":"广西菜","Children":null},{"Id":5031,"Name":"内蒙菜","Children":null},{"Id":4920,"Name":"鲁菜","Children":null},{"Id":4922,"Name":"山西菜","Children":null},{"Id":4921,"Name":"河南菜","Children":null},{"Id":5038,"Name":"其他中餐","Children":null}]},{"Id":10000002,"Name":"西餐","Children":[{"Id":10000002,"Name":"全部","Children":null},{"Id":4962,"Name":"牛排","Children":null},{"Id":4953,"Name":"法国菜","Children":null},{"Id":4954,"Name":"意大利菜","Children":null},{"Id":4958,"Name":"地中海菜","Children":null},{"Id":5044,"Name":"美国菜","Children":null},{"Id":4955,"Name":"西班牙菜","Children":null},{"Id":4956,"Name":"土耳其菜","Children":null},{"Id":7046,"Name":"德国菜","Children":null},{"Id":4960,"Name":"披萨","Children":null},{"Id":4961,"Name":"意大利面","Children":null},{"Id":4907,"Name":"拉美料理","Children":null},{"Id":7041,"Name":"英国菜","Children":null},{"Id":7051,"Name":"希腊菜","Children":null},{"Id":4957,"Name":"俄罗斯菜","Children":null}]},{"Id":4903,"Name":"火锅","Children":[{"Id":4903,"Name":"全部","Children":null},{"Id":4976,"Name":"川味/重庆火锅","Children":null},{"Id":4974,"Name":"老北京火锅","Children":null},{"Id":4975,"Name":"小火锅","Children":null},{"Id":4973,"Name":"粥火锅","Children":null},{"Id":4972,"Name":"鱼火锅","Children":null}]},{"Id":4904,"Name":"日本料理","Children":[{"Id":4904,"Name":"全部","Children":null},{"Id":4980,"Name":"寿司","Children":null},{"Id":4979,"Name":"日式铁板烧","Children":null},{"Id":4981,"Name":"居酒屋","Children":null},{"Id":4982,"Name":"日式火锅","Children":null},{"Id":5041,"Name":"日式拉面","Children":null}]},{"Id":4931,"Name":"烧烤","Children":[{"Id":4931,"Name":"全部","Children":null},{"Id":5043,"Name":"烤肉","Children":null}]},{"Id":4908,"Name":"小吃","Children":[{"Id":4908,"Name":"全部","Children":null},{"Id":4996,"Name":"面食","Children":null},{"Id":5000,"Name":"麻辣烫","Children":null},{"Id":4995,"Name":"熟食/卤味/烧腊","Children":null},{"Id":4997,"Name":"米粉/米线","Children":null},{"Id":4999,"Name":"小龙虾","Children":null},{"Id":5002,"Name":"零食/干货","Children":null}]},{"Id":4905,"Name":"韩国料理","Children":[{"Id":4905,"Name":"全部","Children":null},{"Id":4983,"Name":"韩国烤肉","Children":null},{"Id":4985,"Name":"韩式火锅","Children":null}]},{"Id":4901,"Name":"快餐简餐","Children":[{"Id":4901,"Name":"全部","Children":null},{"Id":4964,"Name":"中式快餐","Children":null},{"Id":4963,"Name":"西式快餐","Children":null},{"Id":7036,"Name":"三明治","Children":null}]},{"Id":4902,"Name":"面包甜点","Children":[{"Id":4902,"Name":"全部","Children":null},{"Id":4966,"Name":"西式甜点","Children":null},{"Id":4968,"Name":"面包店","Children":null},{"Id":4970,"Name":"饮品","Children":null},{"Id":4967,"Name":"冰激凌","Children":null},{"Id":4969,"Name":"中式甜品","Children":null}]},{"Id":4906,"Name":"东南亚菜","Children":[{"Id":4906,"Name":"全部","Children":null},{"Id":4986,"Name":"泰国菜","Children":null},{"Id":4990,"Name":"越南菜","Children":null},{"Id":4989,"Name":"印度菜","Children":null},{"Id":4988,"Name":"马来西亚菜","Children":null},{"Id":4987,"Name":"新加坡菜","Children":null}]},{"Id":4929,"Name":"咖啡店","Children":[]},{"Id":4934,"Name":"海鲜","Children":[]},{"Id":4938,"Name":"创意菜","Children":[]},{"Id":4927,"Name":"酒吧/酒馆","Children":[]},{"Id":4910,"Name":"农家菜","Children":[]},{"Id":4936,"Name":"自助餐","Children":[]},{"Id":7056,"Name":"亚洲菜","Children":[]},{"Id":4928,"Name":"素食","Children":[]},{"Id":4930,"Name":"清真菜","Children":[]},{"Id":4935,"Name":"茶馆/茶室","Children":[]},{"Id":4933,"Name":"中东料理","Children":[]},{"Id":20596,"Name":"融合菜","Children":[]},{"Id":4932,"Name":"非洲菜","Children":[]},{"Id":4940,"Name":"其他","Children":[]}]
         * DefaultSort : [{"Id":24,"Name":"智能排序"},{"Id":23,"Name":"距离最近"},{"Id":5,"Name":"人均最高"},{"Id":4,"Name":"人均最低"}]
         * SellSort : [{"Id":9999999,"Name":"全部"},{"Id":100,"Name":"特惠套餐"},{"Id":4,"Name":"订座"}]
         * PriceSort : [{"Id":4,"Name":"300以上"},{"Id":3,"Name":"200-300"},{"Id":2,"Name":"100-200"},{"Id":1,"Name":"100以内"}]
         * SceneSort : [{"Id":1152,"Name":"深夜营业"},{"Id":1153,"Name":"下午茶"},{"Id":1189,"Name":"早茶"},{"Id":1156,"Name":"景观餐厅"},{"Id":102,"Name":"老字号"},{"Id":6414,"Name":"海景餐厅"},{"Id":1151,"Name":"酒店餐厅"},{"Id":1376,"Name":"Brunch"},{"Id":6412,"Name":"高空景观"},{"Id":6415,"Name":"特色早餐"},{"Id":1157,"Name":"名人光顾"},{"Id":1197,"Name":"糖水铺"},{"Id":1154,"Name":"主题餐厅"},{"Id":6419,"Name":"品质奶茶店"},{"Id":6413,"Name":"露台餐厅"},{"Id":6420,"Name":"高颜值餐厅"},{"Id":1406,"Name":"知名连锁"},{"Id":6417,"Name":"撸串圣地"},{"Id":1178,"Name":"伴手礼"},{"Id":6418,"Name":"精致餐饮"},{"Id":6416,"Name":"老牌糕点"},{"Id":1375,"Name":"明星主厨"},{"Id":1407,"Name":"外国人喜欢"},{"Id":6426,"Name":"情侣约会"},{"Id":1404,"Name":"明星老板"},{"Id":6422,"Name":"百年老店"},{"Id":1182,"Name":"影视取景地"},{"Id":101,"Name":"美食街"},{"Id":6421,"Name":"设计师餐厅"},{"Id":6408,"Name":"大排档"},{"Id":6427,"Name":"家庭聚餐"},{"Id":1155,"Name":"老建筑餐厅"},{"Id":1395,"Name":"亲子餐厅"},{"Id":6409,"Name":"庭院餐厅"},{"Id":6410,"Name":"花园餐厅"},{"Id":1171,"Name":"夜市小吃"},{"Id":1185,"Name":"洋房餐厅"},{"Id":1191,"Name":"苍蝇馆子"},{"Id":6424,"Name":"非遗美食"},{"Id":6425,"Name":"闺蜜聚会"},{"Id":6428,"Name":"商务宴请"},{"Id":6431,"Name":"工业风"}]
         * FoodSort : ["鲍鱼","烧鹅","基围虾","三黄鸡","肠粉","潮汕牛肉火锅","腊鸭","乌头鱼","鲜蚝","虾饺","乳鸽","干炒牛河","客家酿豆腐","烤生蚝"]
         * ShiMeiLin : [{"Id":30,"Name":"全部美食林","Intro":"美食家推荐，携程精选认证，不辜负旅行中的每一餐","Count":546},{"Id":1,"Name":"美食林三星","Intro":"一辈子总要去一次的餐厅","Count":3},{"Id":2,"Name":"美食林二星","Intro":"值得专程预约的餐厅","Count":6},{"Id":3,"Name":"美食林一星","Intro":"能给旅行带来惊喜的餐厅","Count":31},{"Id":4,"Name":"美食林臻选","Intro":"精致餐厅，品味推荐","Count":330},{"Id":5,"Name":"美食林风味","Intro":"本地特色，人气小馆","Count":176}]
         * RegionSort : [{"Id":"207","Name":"福田区"},{"Id":"209","Name":"盐田区"},{"Id":"211","Name":"龙岗区"},{"Id":"213","Name":"南山区"},{"Id":"214","Name":"宝安区"},{"Id":"215","Name":"罗湖区"},{"Id":"104148","Name":"龙华区"},{"Id":"104149","Name":"坪山区"}]
         * RecommendPositionSort : null
         * MetroSort : [{"Id":"155","Name":"5号环中线","EName":"Line 5","Stations":[{"Id":"903","Name":"黄贝岭","EName":"Huangbeiling  "},{"Id":"904","Name":"怡景","EName":"Yijing  "},{"Id":"905","Name":"太安","EName":"Tai'an  "},{"Id":"906","Name":"布心","EName":"Buxin  "},{"Id":"907","Name":"百鸽笼","EName":"Baigelong  "},{"Id":"908","Name":"布吉","EName":"Buji  "},{"Id":"909","Name":"长龙","EName":"Changlong  "},{"Id":"910","Name":"下水径","EName":"Xiashuijing  "},{"Id":"911","Name":"上水径","EName":"Shangshuijing  "},{"Id":"912","Name":"杨美","EName":"Yangmei  "},{"Id":"913","Name":"坂田","EName":"Bantian  "},{"Id":"914","Name":"五和","EName":"Wuhe  "},{"Id":"915","Name":"民治","EName":"Minzhi  "},{"Id":"916","Name":"深圳北站","EName":" Shenzhen North Station  "},{"Id":"917","Name":"长岭陂","EName":"Changlingpi "},{"Id":"918","Name":"塘朗","EName":"Tanglang  "},{"Id":"919","Name":"大学城","EName":"University Town "},{"Id":"920","Name":"西丽","EName":"Xili  "},{"Id":"921","Name":"留仙洞","EName":"Liuxiandong  "},{"Id":"922","Name":"兴东","EName":"Xingdong  "},{"Id":"923","Name":"洪浪北","EName":" Honglang North  "},{"Id":"924","Name":"灵芝","EName":"Lingzhi  "},{"Id":"925","Name":"翻身","EName":"Fanshen "},{"Id":"926","Name":"宝安中心","EName":"Bao'an Center "},{"Id":"927","Name":"宝华","EName":"Baohua "},{"Id":"928","Name":"临海","EName":"Linhai  "},{"Id":"929","Name":"前海湾","EName":"Qianhaiwan  "}]},{"Id":"157","Name":"3号龙岗线","EName":"Line 3","Stations":[{"Id":"946","Name":"双龙","EName":"Shuanglong  "},{"Id":"947","Name":"南联","EName":"Nanlian  "},{"Id":"948","Name":"龙城广场","EName":"Longcheng Square  "},{"Id":"949","Name":"吉祥","EName":"Jixiang  "},{"Id":"950","Name":"爱联","EName":"Ai Lian "},{"Id":"951","Name":"大运","EName":"Universiade "},{"Id":"952","Name":"荷坳","EName":"He Ao "},{"Id":"953","Name":"永湖","EName":"Yonghu  "},{"Id":"954","Name":"横岗","EName":"Heng Gang "},{"Id":"955","Name":"塘坑","EName":"Tangkeng  "},{"Id":"956","Name":"六约","EName":"Liuyue  "},{"Id":"957","Name":"丹竹头","EName":"Danzhutou "},{"Id":"958","Name":"大芬","EName":"Dafen "},{"Id":"959","Name":"木棉湾","EName":"Mumianwan  "},{"Id":"960","Name":"布吉","EName":"Buji "},{"Id":"961","Name":"草埔","EName":"Caopu "},{"Id":"962","Name":"水贝","EName":"Shuibei  "},{"Id":"963","Name":"田贝","EName":"Tianbei  "},{"Id":"964","Name":"翠竹","EName":"Cuizhu "},{"Id":"965","Name":"晒布","EName":"Shaibu  "},{"Id":"966","Name":"老街","EName":"Laojie  "},{"Id":"967","Name":"红岭","EName":" Hongling "},{"Id":"968","Name":"通新岭","EName":"Tongxinling  "},{"Id":"969","Name":"华新","EName":"Huaxin  "},{"Id":"970","Name":"莲花村","EName":"Lianhuacun  "},{"Id":"971","Name":"少年宫","EName":"Shaoniangong  "},{"Id":"972","Name":"福田","EName":"Futian "},{"Id":"973","Name":"购物公园","EName":"COCO Park "},{"Id":"974","Name":"石厦","EName":"Shixia  "},{"Id":"975","Name":"益田","EName":"Yitian  "}]},{"Id":"159","Name":"4号龙华线","EName":"Line 4","Stations":[{"Id":"989","Name":"福田口岸","EName":"Futian Checkpoint "},{"Id":"990","Name":"福民","EName":"Fumin "},{"Id":"991","Name":"会展中心","EName":"Convention & Exhibition Center  "},{"Id":"992","Name":"市民中心","EName":"Civic Center  "},{"Id":"993","Name":"少年宫","EName":"Shaoniangong  "},{"Id":"994","Name":"莲花北","EName":"Lianhua North  "},{"Id":"995","Name":"上梅林","EName":"Shangmeilin  "},{"Id":"996","Name":"民乐","EName":"Minle "},{"Id":"997","Name":"白石龙","EName":"Baishilong "},{"Id":"998","Name":"深圳北站","EName":"Shenzhen North Railway Station "},{"Id":"999","Name":"红山","EName":"Hongshan "},{"Id":"1000","Name":"上塘","EName":"Shangtang "},{"Id":"1001","Name":"龙胜","EName":"Longsheng "},{"Id":"1002","Name":"龙华","EName":"Longhua "},{"Id":"1003","Name":"清湖","EName":"Qinghu "}]},{"Id":"161","Name":"1号罗宝线","EName":"Line 1","Stations":[{"Id":"1020","Name":"机场东","EName":"Airport East "},{"Id":"1021","Name":"后瑞","EName":"Hourui "},{"Id":"1022","Name":"固戍","EName":"Gushu "},{"Id":"1023","Name":"西乡","EName":"Xixiang "},{"Id":"1024","Name":"坪洲","EName":"Pingzhou "},{"Id":"1025","Name":"宝体","EName":"Bao'an Stadium "},{"Id":"1026","Name":"宝安中心","EName":"Bao'an Center "},{"Id":"1027","Name":"新安","EName":"Xin'an "},{"Id":"1028","Name":"前海湾","EName":"Qianhaiwan "},{"Id":"1029","Name":"鲤鱼门","EName":"Liyumen "},{"Id":"1030","Name":"大新","EName":"Daxin "},{"Id":"1031","Name":"桃园","EName":"Taoyuan "},{"Id":"1032","Name":"深大","EName":"Shenzhen University "},{"Id":"1033","Name":"高新园","EName":"Hi-Tech Park "},{"Id":"1034","Name":"白石洲","EName":"Baishizhou "},{"Id":"1035","Name":"世界之窗","EName":"Window of the World "},{"Id":"1036","Name":"华侨城","EName":"Hua Qiao Cheng "},{"Id":"1037","Name":"侨城东","EName":"Qiaocheng East "},{"Id":"1038","Name":"竹子林","EName":"Zhuzilin "},{"Id":"1039","Name":"车公庙","EName":"Chegongmiao "},{"Id":"1040","Name":"香蜜湖","EName":"Xiangmihu "},{"Id":"1041","Name":"购物公园","EName":"COCO Park "},{"Id":"1042","Name":"会展中心","EName":"Convention & Exhibition Center "},{"Id":"1043","Name":"岗厦","EName":"Gangxia "},{"Id":"1044","Name":"华强路","EName":"Huaqiang Lu "},{"Id":"1045","Name":"科学馆","EName":"Kexueguan "},{"Id":"1046","Name":"大剧院","EName":"Grand Theater "},{"Id":"1047","Name":"老街","EName":"Lao Jie "},{"Id":"1048","Name":"国贸","EName":"Guomao "},{"Id":"1049","Name":"罗湖","EName":"Luo Hu "}]},{"Id":"163","Name":"2号蛇口线","EName":"Line 2","Stations":[{"Id":"1074","Name":"赤湾","EName":"Chiwan "},{"Id":"1075","Name":"蛇口港","EName":"Shekou Port "},{"Id":"1076","Name":"海上世界","EName":"Sea World "},{"Id":"1077","Name":"水湾","EName":"Shuiwan "},{"Id":"1078","Name":"东角头","EName":"Dongjiaotou "},{"Id":"1079","Name":"湾厦","EName":"Wanxia "},{"Id":"1080","Name":"海月","EName":"Haiyue "},{"Id":"1081","Name":"登良","EName":"Dengliang "},{"Id":"1082","Name":"后海","EName":"Houhai "},{"Id":"1083","Name":"科苑","EName":"Keyuan "},{"Id":"1084","Name":"红树湾","EName":"Hongshuwan "},{"Id":"1085","Name":"世界之窗","EName":"Window of the World "},{"Id":"1086","Name":"侨城北","EName":"Qiaocheng North "},{"Id":"1087","Name":"深康","EName":"Shenkang "},{"Id":"1088","Name":"安托山","EName":"Antuoshan "},{"Id":"1089","Name":"侨香","EName":"Qiaoxiang "},{"Id":"1090","Name":"香蜜","EName":"Xiangmi "},{"Id":"1091","Name":"香梅北","EName":"Xiangmei North "},{"Id":"1092","Name":"景田","EName":"Jingtian "},{"Id":"1093","Name":"莲花西","EName":"Lianhua West "},{"Id":"1094","Name":"福田","EName":"Futian "},{"Id":"1095","Name":"市民中心","EName":"Civic Center "},{"Id":"1096","Name":"岗厦北","EName":"Gangxia North "},{"Id":"1097","Name":"华强北","EName":"Huaqiang North "},{"Id":"1098","Name":"燕南","EName":"Yannan "},{"Id":"1099","Name":"大剧院","EName":"Grand Theater "},{"Id":"1100","Name":"湖贝","EName":"Hubei "},{"Id":"1101","Name":"黄贝岭","EName":"Huangbeiling "},{"Id":"1102","Name":"新秀","EName":"Xinxiu "}]},{"Id":"605","Name":"9号线","EName":"","Stations":[{"Id":"20338","Name":"文锦","EName":""},{"Id":"20339","Name":"向西村","EName":""},{"Id":"20340","Name":"人民南","EName":""},{"Id":"20341","Name":"鹿丹村","EName":""},{"Id":"20342","Name":"红岭南","EName":""},{"Id":"20343","Name":"红岭","EName":""},{"Id":"20344","Name":"园岭","EName":""},{"Id":"20345","Name":"红岭北","EName":""},{"Id":"20346","Name":"泥岗","EName":""},{"Id":"20347","Name":"银湖","EName":""},{"Id":"20348","Name":"孖岭","EName":""},{"Id":"20349","Name":"上梅林","EName":""},{"Id":"20350","Name":"梅村","EName":""},{"Id":"20351","Name":"下梅林","EName":""},{"Id":"20352","Name":"梅景","EName":""},{"Id":"20353","Name":"景田","EName":""},{"Id":"20354","Name":"香梅","EName":""},{"Id":"20355","Name":"车公庙","EName":""},{"Id":"20356","Name":"下沙","EName":""},{"Id":"20307","Name":"深圳湾公园","EName":""},{"Id":"20308","Name":"深湾","EName":""},{"Id":"20309","Name":"红树湾南","EName":""}]},{"Id":"606","Name":"7号线","EName":"","Stations":[{"Id":"20327","Name":"上沙","EName":""},{"Id":"20328","Name":"车公庙","EName":""},{"Id":"20329","Name":"农林","EName":"Nonglin"},{"Id":"20330","Name":"安托山","EName":""},{"Id":"20331","Name":"深云","EName":""},{"Id":"20332","Name":"桃源村","EName":""},{"Id":"20333","Name":"龙井","EName":""},{"Id":"20334","Name":"珠光","EName":""},{"Id":"20335","Name":"茶光","EName":""},{"Id":"20336","Name":"西丽","EName":""},{"Id":"20337","Name":"西丽湖","EName":""},{"Id":"20310","Name":"太安","EName":""},{"Id":"20311","Name":"田贝","EName":""},{"Id":"20312","Name":"洪湖","EName":""},{"Id":"20313","Name":"笋岗","EName":""},{"Id":"20314","Name":"红岭北","EName":""},{"Id":"20315","Name":"八卦岭","EName":""},{"Id":"20316","Name":"黄木岗","EName":""},{"Id":"20317","Name":"华新","EName":""},{"Id":"20318","Name":"华强北","EName":""},{"Id":"20319","Name":"华强南","EName":""},{"Id":"20320","Name":"赤尾","EName":""},{"Id":"20321","Name":"福邻（暂未开通）","EName":""},{"Id":"20322","Name":"皇岗口岸","EName":""},{"Id":"20323","Name":"福民","EName":""},{"Id":"20324","Name":"皇岗村","EName":""},{"Id":"20325","Name":"石厦","EName":""},{"Id":"20326","Name":"沙尾","EName":""}]},{"Id":"607","Name":"11号线","EName":"","Stations":[{"Id":"20289","Name":"碧头","EName":""},{"Id":"20290","Name":"松岗","EName":""},{"Id":"20291","Name":"后亭","EName":""},{"Id":"20292","Name":"沙井","EName":""},{"Id":"20293","Name":"马安山","EName":""},{"Id":"20294","Name":"塘尾","EName":""},{"Id":"20295","Name":"桥头","EName":""},{"Id":"20296","Name":"福永","EName":""},{"Id":"20297","Name":"机场北","EName":""},{"Id":"20298","Name":"机场","EName":""},{"Id":"20299","Name":"碧海湾","EName":""},{"Id":"20300","Name":"宝安","EName":""},{"Id":"20301","Name":"前海湾","EName":""},{"Id":"20302","Name":"南山","EName":"Nanshan"},{"Id":"20303","Name":"后海","EName":""},{"Id":"20304","Name":"红树湾南","EName":""},{"Id":"20305","Name":"车公庙","EName":""},{"Id":"20306","Name":"福田","EName":""}]}]
         */

        private Object DistanceSort;
        private Object RecommendPositionSort;
        private List<LandmarkSortBean> LandmarkSort;
        private List<ZoneSortBean> ZoneSort;
        private List<CuisineSortBean> CuisineSort;
        private List<DefaultSortBean> DefaultSort;
        private List<SellSortBean> SellSort;
        private List<PriceSortBean> PriceSort;
        private List<SceneSortBean> SceneSort;
        private List<String> FoodSort;
        private List<ShiMeiLinBean> ShiMeiLin;
        private List<RegionSortBean> RegionSort;
        private List<MetroSortBean> MetroSort;

        public static FilterBean objectFromData(String str) {

            return new Gson().fromJson(str, FilterBean.class);
        }

        public Object getDistanceSort() {
            return DistanceSort;
        }

        public void setDistanceSort(Object DistanceSort) {
            this.DistanceSort = DistanceSort;
        }

        public Object getRecommendPositionSort() {
            return RecommendPositionSort;
        }

        public void setRecommendPositionSort(Object RecommendPositionSort) {
            this.RecommendPositionSort = RecommendPositionSort;
        }

        public List<LandmarkSortBean> getLandmarkSort() {
            return LandmarkSort;
        }

        public void setLandmarkSort(List<LandmarkSortBean> LandmarkSort) {
            this.LandmarkSort = LandmarkSort;
        }

        public List<ZoneSortBean> getZoneSort() {
            return ZoneSort;
        }

        public void setZoneSort(List<ZoneSortBean> ZoneSort) {
            this.ZoneSort = ZoneSort;
        }

        public List<CuisineSortBean> getCuisineSort() {
            return CuisineSort;
        }

        public void setCuisineSort(List<CuisineSortBean> CuisineSort) {
            this.CuisineSort = CuisineSort;
        }

        public List<DefaultSortBean> getDefaultSort() {
            return DefaultSort;
        }

        public void setDefaultSort(List<DefaultSortBean> DefaultSort) {
            this.DefaultSort = DefaultSort;
        }

        public List<SellSortBean> getSellSort() {
            return SellSort;
        }

        public void setSellSort(List<SellSortBean> SellSort) {
            this.SellSort = SellSort;
        }

        public List<PriceSortBean> getPriceSort() {
            return PriceSort;
        }

        public void setPriceSort(List<PriceSortBean> PriceSort) {
            this.PriceSort = PriceSort;
        }

        public List<SceneSortBean> getSceneSort() {
            return SceneSort;
        }

        public void setSceneSort(List<SceneSortBean> SceneSort) {
            this.SceneSort = SceneSort;
        }

        public List<String> getFoodSort() {
            return FoodSort;
        }

        public void setFoodSort(List<String> FoodSort) {
            this.FoodSort = FoodSort;
        }

        public List<ShiMeiLinBean> getShiMeiLin() {
            return ShiMeiLin;
        }

        public void setShiMeiLin(List<ShiMeiLinBean> ShiMeiLin) {
            this.ShiMeiLin = ShiMeiLin;
        }

        public List<RegionSortBean> getRegionSort() {
            return RegionSort;
        }

        public void setRegionSort(List<RegionSortBean> RegionSort) {
            this.RegionSort = RegionSort;
        }

        public List<MetroSortBean> getMetroSort() {
            return MetroSort;
        }

        public void setMetroSort(List<MetroSortBean> MetroSort) {
            this.MetroSort = MetroSort;
        }

        public static class LandmarkSortBean {
            /**
             * Id : 8370
             * Name : 东门老街
             * Lat : 22.545400619506836
             * Lon : 114.11900329589844
             */

            private int Id;
            private String Name;
            private double Lat;
            private double Lon;

            public static LandmarkSortBean objectFromData(String str) {

                return new Gson().fromJson(str, LandmarkSortBean.class);
            }

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public double getLat() {
                return Lat;
            }

            public void setLat(double Lat) {
                this.Lat = Lat;
            }

            public double getLon() {
                return Lon;
            }

            public void setLon(double Lon) {
                this.Lon = Lon;
            }
        }

        public static class ZoneSortBean {
            /**
             * ZoneId : 19211009
             * ZoneName : 体育中心
             */

            private int ZoneId;
            private String ZoneName;

            public static ZoneSortBean objectFromData(String str) {

                return new Gson().fromJson(str, ZoneSortBean.class);
            }

            public int getZoneId() {
                return ZoneId;
            }

            public void setZoneId(int ZoneId) {
                this.ZoneId = ZoneId;
            }

            public String getZoneName() {
                return ZoneName;
            }

            public void setZoneName(String ZoneName) {
                this.ZoneName = ZoneName;
            }
        }

        public static class CuisineSortBean {
            /**
             * Id : 10000001
             * Name : 地方菜
             * Children : [{"Id":10000001,"Name":"全部","Children":null},{"Id":4898,"Name":"粤菜","Children":null},{"Id":4915,"Name":"湘菜","Children":null},{"Id":4896,"Name":"川菜","Children":null},{"Id":4897,"Name":"江浙菜","Children":null},{"Id":4909,"Name":"本帮菜","Children":null},{"Id":4924,"Name":"东北菜","Children":null},{"Id":4939,"Name":"客家菜","Children":null},{"Id":4923,"Name":"西北菜","Children":null},{"Id":4899,"Name":"北京菜","Children":null},{"Id":4919,"Name":"云南菜","Children":null},{"Id":4925,"Name":"新疆菜","Children":null},{"Id":4913,"Name":"湖北菜","Children":null},{"Id":4911,"Name":"徽菜","Children":null},{"Id":4926,"Name":"海南菜","Children":null},{"Id":4917,"Name":"台湾菜","Children":null},{"Id":4914,"Name":"贵州菜","Children":null},{"Id":4912,"Name":"江西菜","Children":null},{"Id":4916,"Name":"闽菜","Children":null},{"Id":4918,"Name":"广西菜","Children":null},{"Id":5031,"Name":"内蒙菜","Children":null},{"Id":4920,"Name":"鲁菜","Children":null},{"Id":4922,"Name":"山西菜","Children":null},{"Id":4921,"Name":"河南菜","Children":null},{"Id":5038,"Name":"其他中餐","Children":null}]
             */

            private int Id;
            private String Name;
            private List<ChildrenBean> Children;

            public static CuisineSortBean objectFromData(String str) {

                return new Gson().fromJson(str, CuisineSortBean.class);
            }

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public List<ChildrenBean> getChildren() {
                return Children;
            }

            public void setChildren(List<ChildrenBean> Children) {
                this.Children = Children;
            }

            public static class ChildrenBean {
                /**
                 * Id : 10000001
                 * Name : 全部
                 * Children : null
                 */

                private int Id;
                private String Name;
                private Object Children;

                public static ChildrenBean objectFromData(String str) {

                    return new Gson().fromJson(str, ChildrenBean.class);
                }

                public int getId() {
                    return Id;
                }

                public void setId(int Id) {
                    this.Id = Id;
                }

                public String getName() {
                    return Name;
                }

                public void setName(String Name) {
                    this.Name = Name;
                }

                public Object getChildren() {
                    return Children;
                }

                public void setChildren(Object Children) {
                    this.Children = Children;
                }
            }
        }

        public static class DefaultSortBean {
            /**
             * Id : 24
             * Name : 智能排序
             */

            private int Id;
            private String Name;

            public static DefaultSortBean objectFromData(String str) {

                return new Gson().fromJson(str, DefaultSortBean.class);
            }

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }
        }

        public static class SellSortBean {
            /**
             * Id : 9999999
             * Name : 全部
             */

            private int Id;
            private String Name;

            public static SellSortBean objectFromData(String str) {

                return new Gson().fromJson(str, SellSortBean.class);
            }

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }
        }

        public static class PriceSortBean {
            /**
             * Id : 4
             * Name : 300以上
             */

            private int Id;
            private String Name;

            public static PriceSortBean objectFromData(String str) {

                return new Gson().fromJson(str, PriceSortBean.class);
            }

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }
        }

        public static class SceneSortBean {
            /**
             * Id : 1152
             * Name : 深夜营业
             */

            private int Id;
            private String Name;

            public static SceneSortBean objectFromData(String str) {

                return new Gson().fromJson(str, SceneSortBean.class);
            }

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }
        }

        public static class ShiMeiLinBean {
            /**
             * Id : 30
             * Name : 全部美食林
             * Intro : 美食家推荐，携程精选认证，不辜负旅行中的每一餐
             * Count : 546
             */

            private int Id;
            private String Name;
            private String Intro;
            private int Count;

            public static ShiMeiLinBean objectFromData(String str) {

                return new Gson().fromJson(str, ShiMeiLinBean.class);
            }

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getIntro() {
                return Intro;
            }

            public void setIntro(String Intro) {
                this.Intro = Intro;
            }

            public int getCount() {
                return Count;
            }

            public void setCount(int Count) {
                this.Count = Count;
            }
        }

        public static class RegionSortBean {
            /**
             * Id : 207
             * Name : 福田区
             */

            private String Id;
            private String Name;

            public static RegionSortBean objectFromData(String str) {

                return new Gson().fromJson(str, RegionSortBean.class);
            }

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }
        }

        public static class MetroSortBean {
            /**
             * Id : 155
             * Name : 5号环中线
             * EName : Line 5
             * Stations : [{"Id":"903","Name":"黄贝岭","EName":"Huangbeiling  "},{"Id":"904","Name":"怡景","EName":"Yijing  "},{"Id":"905","Name":"太安","EName":"Tai'an  "},{"Id":"906","Name":"布心","EName":"Buxin  "},{"Id":"907","Name":"百鸽笼","EName":"Baigelong  "},{"Id":"908","Name":"布吉","EName":"Buji  "},{"Id":"909","Name":"长龙","EName":"Changlong  "},{"Id":"910","Name":"下水径","EName":"Xiashuijing  "},{"Id":"911","Name":"上水径","EName":"Shangshuijing  "},{"Id":"912","Name":"杨美","EName":"Yangmei  "},{"Id":"913","Name":"坂田","EName":"Bantian  "},{"Id":"914","Name":"五和","EName":"Wuhe  "},{"Id":"915","Name":"民治","EName":"Minzhi  "},{"Id":"916","Name":"深圳北站","EName":" Shenzhen North Station  "},{"Id":"917","Name":"长岭陂","EName":"Changlingpi "},{"Id":"918","Name":"塘朗","EName":"Tanglang  "},{"Id":"919","Name":"大学城","EName":"University Town "},{"Id":"920","Name":"西丽","EName":"Xili  "},{"Id":"921","Name":"留仙洞","EName":"Liuxiandong  "},{"Id":"922","Name":"兴东","EName":"Xingdong  "},{"Id":"923","Name":"洪浪北","EName":" Honglang North  "},{"Id":"924","Name":"灵芝","EName":"Lingzhi  "},{"Id":"925","Name":"翻身","EName":"Fanshen "},{"Id":"926","Name":"宝安中心","EName":"Bao'an Center "},{"Id":"927","Name":"宝华","EName":"Baohua "},{"Id":"928","Name":"临海","EName":"Linhai  "},{"Id":"929","Name":"前海湾","EName":"Qianhaiwan  "}]
             */

            private String Id;
            private String Name;
            private String EName;
            private List<StationsBean> Stations;

            public static MetroSortBean objectFromData(String str) {

                return new Gson().fromJson(str, MetroSortBean.class);
            }

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
                this.Id = Id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getEName() {
                return EName;
            }

            public void setEName(String EName) {
                this.EName = EName;
            }

            public List<StationsBean> getStations() {
                return Stations;
            }

            public void setStations(List<StationsBean> Stations) {
                this.Stations = Stations;
            }

            public static class StationsBean {
                /**
                 * Id : 903
                 * Name : 黄贝岭
                 * EName : Huangbeiling
                 */

                private String Id;
                private String Name;
                private String EName;

                public static StationsBean objectFromData(String str) {

                    return new Gson().fromJson(str, StationsBean.class);
                }

                public String getId() {
                    return Id;
                }

                public void setId(String Id) {
                    this.Id = Id;
                }

                public String getName() {
                    return Name;
                }

                public void setName(String Name) {
                    this.Name = Name;
                }

                public String getEName() {
                    return EName;
                }

                public void setEName(String EName) {
                    this.EName = EName;
                }
            }
        }
    }

    public static class ResponseStatusBean {
        /**
         * Timestamp : /Date(1591610671016+0800)/
         * Ack : Success
         * Errors : []
         * Build : null
         * Version : null
         * Extension : [{"Id":"CLOGGING_TRACE_ID","Version":null,"ContentType":null,"Value":"7912596765557138411"},{"Id":"RootMessageId","Version":null,"ContentType":null,"Value":"921812-0a3c877d-442114-304739"}]
         */

        private String Timestamp;
        private String Ack;
        private Object Build;
        private Object Version;
        private List<?> Errors;
        private List<ExtensionBean> Extension;

        public static ResponseStatusBean objectFromData(String str) {

            return new Gson().fromJson(str, ResponseStatusBean.class);
        }

        public String getTimestamp() {
            return Timestamp;
        }

        public void setTimestamp(String Timestamp) {
            this.Timestamp = Timestamp;
        }

        public String getAck() {
            return Ack;
        }

        public void setAck(String Ack) {
            this.Ack = Ack;
        }

        public Object getBuild() {
            return Build;
        }

        public void setBuild(Object Build) {
            this.Build = Build;
        }

        public Object getVersion() {
            return Version;
        }

        public void setVersion(Object Version) {
            this.Version = Version;
        }

        public List<?> getErrors() {
            return Errors;
        }

        public void setErrors(List<?> Errors) {
            this.Errors = Errors;
        }

        public List<ExtensionBean> getExtension() {
            return Extension;
        }

        public void setExtension(List<ExtensionBean> Extension) {
            this.Extension = Extension;
        }

        public static class ExtensionBean {
            /**
             * Id : CLOGGING_TRACE_ID
             * Version : null
             * ContentType : null
             * Value : 7912596765557138411
             */

            private String Id;
            private Object Version;
            private Object ContentType;
            private String Value;

            public static ExtensionBean objectFromData(String str) {

                return new Gson().fromJson(str, ExtensionBean.class);
            }

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
                this.Id = Id;
            }

            public Object getVersion() {
                return Version;
            }

            public void setVersion(Object Version) {
                this.Version = Version;
            }

            public Object getContentType() {
                return ContentType;
            }

            public void setContentType(Object ContentType) {
                this.ContentType = ContentType;
            }

            public String getValue() {
                return Value;
            }

            public void setValue(String Value) {
                this.Value = Value;
            }
        }
    }

    public static class CustomFilterBean {
        /**
         * Type : 6
         * Id : 15
         * SubId : null
         * Name : 中国餐厅周特惠套餐
         * Lat : 0
         * Lon : 0
         * IsShowByNow : false
         * Tips : null
         * PicUrlClick : null
         * PicUrlUnClick : null
         * Icon : null
         */

        private int Type;
        private String Id;
        private Object SubId;
        private String Name;
        private int Lat;
        private int Lon;
        private boolean IsShowByNow;
        private Object Tips;
        private Object PicUrlClick;
        private Object PicUrlUnClick;
        private Object Icon;

        public static CustomFilterBean objectFromData(String str) {

            return new Gson().fromJson(str, CustomFilterBean.class);
        }

        public int getType() {
            return Type;
        }

        public void setType(int Type) {
            this.Type = Type;
        }

        public String getId() {
            return Id;
        }

        public void setId(String Id) {
            this.Id = Id;
        }

        public Object getSubId() {
            return SubId;
        }

        public void setSubId(Object SubId) {
            this.SubId = SubId;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getLat() {
            return Lat;
        }

        public void setLat(int Lat) {
            this.Lat = Lat;
        }

        public int getLon() {
            return Lon;
        }

        public void setLon(int Lon) {
            this.Lon = Lon;
        }

        public boolean isIsShowByNow() {
            return IsShowByNow;
        }

        public void setIsShowByNow(boolean IsShowByNow) {
            this.IsShowByNow = IsShowByNow;
        }

        public Object getTips() {
            return Tips;
        }

        public void setTips(Object Tips) {
            this.Tips = Tips;
        }

        public Object getPicUrlClick() {
            return PicUrlClick;
        }

        public void setPicUrlClick(Object PicUrlClick) {
            this.PicUrlClick = PicUrlClick;
        }

        public Object getPicUrlUnClick() {
            return PicUrlUnClick;
        }

        public void setPicUrlUnClick(Object PicUrlUnClick) {
            this.PicUrlUnClick = PicUrlUnClick;
        }

        public Object getIcon() {
            return Icon;
        }

        public void setIcon(Object Icon) {
            this.Icon = Icon;
        }
    }

    public static class RestaurantsBean {
        /**
         * RestaurantId : 5171894
         * PoiId : 11321595
         * Name : 利苑酒家(宝安南路店)
         * BookingText : 386人已预订
         * PriceDesc : null
         * SecondName : null
         * DistrictId : 26
         * Lat : 22.542717
         * Lon : 114.10553
         * GGCoord : {"Lat":22.542717,"Lng":114.10553,"MapImageUrl":null}
         * BCoord : {"Lat":22.548962629169534,"Lng":114.11196544146,"MapImageUrl":null}
         * ImageUrl : https://youimg1.c-ctrip.com/target/100a0y000000lxrdi1BAE_D_265_265_Q90.jpg
         * AveragePrice : 392
         * CurrencyUnit : RMB
         * CommentScore : 4.5
         * CommentCount : 44
         * RecommendedTag : null
         * Distance : null
         * DistanceNum : 5.24276751421506
         * TagNameList : ["早茶"]
         * IsBook : true
         * IsHaveProduct : false
         * IsPromotion : false
         * RecommandType : 1
         * ImageUrl2 : https://youimg1.c-ctrip.com/target/100a0y000000lxrdi1BAE_D_100_100_Q90.jpg
         * Feature : 深色系装潢稳重大气，精致佳肴各有千秋。
         * RankingNum : null
         * ShiMeiLinName : 美食林一星
         * ShiMeiLinType : 3
         * IsHaveHotelProduct : false
         * AdLabelImgUrl : null
         * LandmarkName : 荔枝公园
         * LandmarkDistance : 501m
         * CtripExcellent : null
         * LocalCurrency : null
         * LocalPrice : null
         * MeiShiLinChainTypeName : null
         * OpenStatus : null
         * ZoneName : 万象城/京基100
         * SearchHitType : null
         * SearchHitWord : null
         * KoubeiAmount : null
         * DistrictName : null
         * LinkUrl : null
         * InChina : true
         * IsOversea : false
         * CuisineName : 粤菜
         * HaveDiscountCard : null
         * DistrictCentreDistance : 5.2km
         * IsSupportQueue : false
         * DistanceDesc : 距市中心5.2km
         * RelateHotelName : null
         * HotelCheckinStatus : null
         * InDistrict : true
         * Coupon : null
         * IsFavourite : null
         * BigRankingNo : 2019精选榜
         * SmallRankingNo : 深圳必吃粤菜第5名
         * UgcComment : “擅长粤菜和港式点心”
         * IsHaveVideo : false
         * BookingProductType : 51
         * BookingProductId : 2037272
         * GrouponDesc : null
         * UgcCommentList : ["\u201c粤菜着名餐馆，菜品精致，味道赞\u201d","\u201c鲍汁凤爪，非常软糯，满满的胶原蛋白\u201d","\u201c深圳和广州最出名的粤菜之一\u201d","\u201c本人钟爱虾饺皇\u201d","\u201c擅长粤菜和港式点心\u201d"]
         * BookingTexts : ["建议提前1天预订","386人已预订"]
         */

        private int RestaurantId;
        private int PoiId;
        private String Name;
        private String BookingText;
        private Object PriceDesc;
        private Object SecondName;
        private int DistrictId;
        private double Lat;
        private double Lon;
        private GGCoordBean GGCoord;
        private BCoordBean BCoord;
        private String ImageUrl;
        private int AveragePrice;
        private String CurrencyUnit;
        private String CommentScore;
        private int CommentCount;
        private Object RecommendedTag;
        private Object Distance;
        private double DistanceNum;
        private boolean IsBook;
        private boolean IsHaveProduct;
        private boolean IsPromotion;
        private int RecommandType;
        private String ImageUrl2;
        private String Feature;
        private Object RankingNum;
        private String ShiMeiLinName;
        private int ShiMeiLinType;
        private boolean IsHaveHotelProduct;
        private Object AdLabelImgUrl;
        private String LandmarkName;
        private String LandmarkDistance;
        private Object CtripExcellent;
        private Object LocalCurrency;
        private Object LocalPrice;
        private Object MeiShiLinChainTypeName;
        private Object OpenStatus;
        private String ZoneName;
        private Object SearchHitType;
        private Object SearchHitWord;
        private Object KoubeiAmount;
        private Object DistrictName;
        private Object LinkUrl;
        private boolean InChina;
        private boolean IsOversea;
        private String CuisineName;
        private Object HaveDiscountCard;
        private String DistrictCentreDistance;
        private boolean IsSupportQueue;
        private String DistanceDesc;
        private Object RelateHotelName;
        private Object HotelCheckinStatus;
        private boolean InDistrict;
        private Object Coupon;
        private Object IsFavourite;
        private String BigRankingNo;
        private String SmallRankingNo;
        private String UgcComment;
        private boolean IsHaveVideo;
        private String BookingProductType;
        private String BookingProductId;
        private Object GrouponDesc;
        private List<String> TagNameList;
        private List<String> UgcCommentList;
        private List<String> BookingTexts;

        public static RestaurantsBean objectFromData(String str) {

            return new Gson().fromJson(str, RestaurantsBean.class);
        }

        public int getRestaurantId() {
            return RestaurantId;
        }

        public void setRestaurantId(int RestaurantId) {
            this.RestaurantId = RestaurantId;
        }

        public int getPoiId() {
            return PoiId;
        }

        public void setPoiId(int PoiId) {
            this.PoiId = PoiId;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getBookingText() {
            return BookingText;
        }

        public void setBookingText(String BookingText) {
            this.BookingText = BookingText;
        }

        public Object getPriceDesc() {
            return PriceDesc;
        }

        public void setPriceDesc(Object PriceDesc) {
            this.PriceDesc = PriceDesc;
        }

        public Object getSecondName() {
            return SecondName;
        }

        public void setSecondName(Object SecondName) {
            this.SecondName = SecondName;
        }

        public int getDistrictId() {
            return DistrictId;
        }

        public void setDistrictId(int DistrictId) {
            this.DistrictId = DistrictId;
        }

        public double getLat() {
            return Lat;
        }

        public void setLat(double Lat) {
            this.Lat = Lat;
        }

        public double getLon() {
            return Lon;
        }

        public void setLon(double Lon) {
            this.Lon = Lon;
        }

        public GGCoordBean getGGCoord() {
            return GGCoord;
        }

        public void setGGCoord(GGCoordBean GGCoord) {
            this.GGCoord = GGCoord;
        }

        public BCoordBean getBCoord() {
            return BCoord;
        }

        public void setBCoord(BCoordBean BCoord) {
            this.BCoord = BCoord;
        }

        public String getImageUrl() {
            return ImageUrl;
        }

        public void setImageUrl(String ImageUrl) {
            this.ImageUrl = ImageUrl;
        }

        public int getAveragePrice() {
            return AveragePrice;
        }

        public void setAveragePrice(int AveragePrice) {
            this.AveragePrice = AveragePrice;
        }

        public String getCurrencyUnit() {
            return CurrencyUnit;
        }

        public void setCurrencyUnit(String CurrencyUnit) {
            this.CurrencyUnit = CurrencyUnit;
        }

        public String getCommentScore() {
            return CommentScore;
        }

        public void setCommentScore(String CommentScore) {
            this.CommentScore = CommentScore;
        }

        public int getCommentCount() {
            return CommentCount;
        }

        public void setCommentCount(int CommentCount) {
            this.CommentCount = CommentCount;
        }

        public Object getRecommendedTag() {
            return RecommendedTag;
        }

        public void setRecommendedTag(Object RecommendedTag) {
            this.RecommendedTag = RecommendedTag;
        }

        public Object getDistance() {
            return Distance;
        }

        public void setDistance(Object Distance) {
            this.Distance = Distance;
        }

        public double getDistanceNum() {
            return DistanceNum;
        }

        public void setDistanceNum(double DistanceNum) {
            this.DistanceNum = DistanceNum;
        }

        public boolean isIsBook() {
            return IsBook;
        }

        public void setIsBook(boolean IsBook) {
            this.IsBook = IsBook;
        }

        public boolean isIsHaveProduct() {
            return IsHaveProduct;
        }

        public void setIsHaveProduct(boolean IsHaveProduct) {
            this.IsHaveProduct = IsHaveProduct;
        }

        public boolean isIsPromotion() {
            return IsPromotion;
        }

        public void setIsPromotion(boolean IsPromotion) {
            this.IsPromotion = IsPromotion;
        }

        public int getRecommandType() {
            return RecommandType;
        }

        public void setRecommandType(int RecommandType) {
            this.RecommandType = RecommandType;
        }

        public String getImageUrl2() {
            return ImageUrl2;
        }

        public void setImageUrl2(String ImageUrl2) {
            this.ImageUrl2 = ImageUrl2;
        }

        public String getFeature() {
            return Feature;
        }

        public void setFeature(String Feature) {
            this.Feature = Feature;
        }

        public Object getRankingNum() {
            return RankingNum;
        }

        public void setRankingNum(Object RankingNum) {
            this.RankingNum = RankingNum;
        }

        public String getShiMeiLinName() {
            return ShiMeiLinName;
        }

        public void setShiMeiLinName(String ShiMeiLinName) {
            this.ShiMeiLinName = ShiMeiLinName;
        }

        public int getShiMeiLinType() {
            return ShiMeiLinType;
        }

        public void setShiMeiLinType(int ShiMeiLinType) {
            this.ShiMeiLinType = ShiMeiLinType;
        }

        public boolean isIsHaveHotelProduct() {
            return IsHaveHotelProduct;
        }

        public void setIsHaveHotelProduct(boolean IsHaveHotelProduct) {
            this.IsHaveHotelProduct = IsHaveHotelProduct;
        }

        public Object getAdLabelImgUrl() {
            return AdLabelImgUrl;
        }

        public void setAdLabelImgUrl(Object AdLabelImgUrl) {
            this.AdLabelImgUrl = AdLabelImgUrl;
        }

        public String getLandmarkName() {
            return LandmarkName;
        }

        public void setLandmarkName(String LandmarkName) {
            this.LandmarkName = LandmarkName;
        }

        public String getLandmarkDistance() {
            return LandmarkDistance;
        }

        public void setLandmarkDistance(String LandmarkDistance) {
            this.LandmarkDistance = LandmarkDistance;
        }

        public Object getCtripExcellent() {
            return CtripExcellent;
        }

        public void setCtripExcellent(Object CtripExcellent) {
            this.CtripExcellent = CtripExcellent;
        }

        public Object getLocalCurrency() {
            return LocalCurrency;
        }

        public void setLocalCurrency(Object LocalCurrency) {
            this.LocalCurrency = LocalCurrency;
        }

        public Object getLocalPrice() {
            return LocalPrice;
        }

        public void setLocalPrice(Object LocalPrice) {
            this.LocalPrice = LocalPrice;
        }

        public Object getMeiShiLinChainTypeName() {
            return MeiShiLinChainTypeName;
        }

        public void setMeiShiLinChainTypeName(Object MeiShiLinChainTypeName) {
            this.MeiShiLinChainTypeName = MeiShiLinChainTypeName;
        }

        public Object getOpenStatus() {
            return OpenStatus;
        }

        public void setOpenStatus(Object OpenStatus) {
            this.OpenStatus = OpenStatus;
        }

        public String getZoneName() {
            return ZoneName;
        }

        public void setZoneName(String ZoneName) {
            this.ZoneName = ZoneName;
        }

        public Object getSearchHitType() {
            return SearchHitType;
        }

        public void setSearchHitType(Object SearchHitType) {
            this.SearchHitType = SearchHitType;
        }

        public Object getSearchHitWord() {
            return SearchHitWord;
        }

        public void setSearchHitWord(Object SearchHitWord) {
            this.SearchHitWord = SearchHitWord;
        }

        public Object getKoubeiAmount() {
            return KoubeiAmount;
        }

        public void setKoubeiAmount(Object KoubeiAmount) {
            this.KoubeiAmount = KoubeiAmount;
        }

        public Object getDistrictName() {
            return DistrictName;
        }

        public void setDistrictName(Object DistrictName) {
            this.DistrictName = DistrictName;
        }

        public Object getLinkUrl() {
            return LinkUrl;
        }

        public void setLinkUrl(Object LinkUrl) {
            this.LinkUrl = LinkUrl;
        }

        public boolean isInChina() {
            return InChina;
        }

        public void setInChina(boolean InChina) {
            this.InChina = InChina;
        }

        public boolean isIsOversea() {
            return IsOversea;
        }

        public void setIsOversea(boolean IsOversea) {
            this.IsOversea = IsOversea;
        }

        public String getCuisineName() {
            return CuisineName;
        }

        public void setCuisineName(String CuisineName) {
            this.CuisineName = CuisineName;
        }

        public Object getHaveDiscountCard() {
            return HaveDiscountCard;
        }

        public void setHaveDiscountCard(Object HaveDiscountCard) {
            this.HaveDiscountCard = HaveDiscountCard;
        }

        public String getDistrictCentreDistance() {
            return DistrictCentreDistance;
        }

        public void setDistrictCentreDistance(String DistrictCentreDistance) {
            this.DistrictCentreDistance = DistrictCentreDistance;
        }

        public boolean isIsSupportQueue() {
            return IsSupportQueue;
        }

        public void setIsSupportQueue(boolean IsSupportQueue) {
            this.IsSupportQueue = IsSupportQueue;
        }

        public String getDistanceDesc() {
            return DistanceDesc;
        }

        public void setDistanceDesc(String DistanceDesc) {
            this.DistanceDesc = DistanceDesc;
        }

        public Object getRelateHotelName() {
            return RelateHotelName;
        }

        public void setRelateHotelName(Object RelateHotelName) {
            this.RelateHotelName = RelateHotelName;
        }

        public Object getHotelCheckinStatus() {
            return HotelCheckinStatus;
        }

        public void setHotelCheckinStatus(Object HotelCheckinStatus) {
            this.HotelCheckinStatus = HotelCheckinStatus;
        }

        public boolean isInDistrict() {
            return InDistrict;
        }

        public void setInDistrict(boolean InDistrict) {
            this.InDistrict = InDistrict;
        }

        public Object getCoupon() {
            return Coupon;
        }

        public void setCoupon(Object Coupon) {
            this.Coupon = Coupon;
        }

        public Object getIsFavourite() {
            return IsFavourite;
        }

        public void setIsFavourite(Object IsFavourite) {
            this.IsFavourite = IsFavourite;
        }

        public String getBigRankingNo() {
            return BigRankingNo;
        }

        public void setBigRankingNo(String BigRankingNo) {
            this.BigRankingNo = BigRankingNo;
        }

        public String getSmallRankingNo() {
            return SmallRankingNo;
        }

        public void setSmallRankingNo(String SmallRankingNo) {
            this.SmallRankingNo = SmallRankingNo;
        }

        public String getUgcComment() {
            return UgcComment;
        }

        public void setUgcComment(String UgcComment) {
            this.UgcComment = UgcComment;
        }

        public boolean isIsHaveVideo() {
            return IsHaveVideo;
        }

        public void setIsHaveVideo(boolean IsHaveVideo) {
            this.IsHaveVideo = IsHaveVideo;
        }

        public String getBookingProductType() {
            return BookingProductType;
        }

        public void setBookingProductType(String BookingProductType) {
            this.BookingProductType = BookingProductType;
        }

        public String getBookingProductId() {
            return BookingProductId;
        }

        public void setBookingProductId(String BookingProductId) {
            this.BookingProductId = BookingProductId;
        }

        public Object getGrouponDesc() {
            return GrouponDesc;
        }

        public void setGrouponDesc(Object GrouponDesc) {
            this.GrouponDesc = GrouponDesc;
        }

        public List<String> getTagNameList() {
            return TagNameList;
        }

        public void setTagNameList(List<String> TagNameList) {
            this.TagNameList = TagNameList;
        }

        public List<String> getUgcCommentList() {
            return UgcCommentList;
        }

        public void setUgcCommentList(List<String> UgcCommentList) {
            this.UgcCommentList = UgcCommentList;
        }

        public List<String> getBookingTexts() {
            return BookingTexts;
        }

        public void setBookingTexts(List<String> BookingTexts) {
            this.BookingTexts = BookingTexts;
        }

        public static class GGCoordBean {
            /**
             * Lat : 22.542717
             * Lng : 114.10553
             * MapImageUrl : null
             */

            private double Lat;
            private double Lng;
            private Object MapImageUrl;

            public static GGCoordBean objectFromData(String str) {

                return new Gson().fromJson(str, GGCoordBean.class);
            }

            public double getLat() {
                return Lat;
            }

            public void setLat(double Lat) {
                this.Lat = Lat;
            }

            public double getLng() {
                return Lng;
            }

            public void setLng(double Lng) {
                this.Lng = Lng;
            }

            public Object getMapImageUrl() {
                return MapImageUrl;
            }

            public void setMapImageUrl(Object MapImageUrl) {
                this.MapImageUrl = MapImageUrl;
            }
        }

        public static class BCoordBean {
            /**
             * Lat : 22.548962629169534
             * Lng : 114.11196544146
             * MapImageUrl : null
             */

            private double Lat;
            private double Lng;
            private Object MapImageUrl;

            public static BCoordBean objectFromData(String str) {

                return new Gson().fromJson(str, BCoordBean.class);
            }

            public double getLat() {
                return Lat;
            }

            public void setLat(double Lat) {
                this.Lat = Lat;
            }

            public double getLng() {
                return Lng;
            }

            public void setLng(double Lng) {
                this.Lng = Lng;
            }

            public Object getMapImageUrl() {
                return MapImageUrl;
            }

            public void setMapImageUrl(Object MapImageUrl) {
                this.MapImageUrl = MapImageUrl;
            }
        }
    }
}
