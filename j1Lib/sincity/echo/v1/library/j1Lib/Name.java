package j1Lib.sincity.echo.v1.library.j1Lib;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Name {
	public static String getChinese() {
		Random random = new Random(System.currentTimeMillis());

		String[] Surname = { "趙", "錢", "孫", "李", "週", "吳", "鄭", "王", "馮", "陳", "褚", "衛", "蔣", "沉", "韓", "楊", "朱", "秦",
				"尤", "許", "何", "呂", "施", "張", "孔", "曹", "嚴", "華", "金", "魏", "陶", "姜", "戚", "謝", "鄒", "喻", "柏", "水", "竇",
				"章", "雲", "蘇", "潘", "葛", "奚", "範", "彭", "郎", "魯", "韋", "昌", "馬", "苗", "鳳", "花", "方", "俞", "任", "袁", "柳",
				"酆", "鮑", "史", "唐", "費", "廉", "岑", "薛", "雷", "賀", "倪", "湯", "滕", "殷", "羅", "畢", "郝", "鄔", "安", "常", "樂",
				"於", "時", "傅", "皮", "卞", "齊", "康", "伍", "餘", "元", "卜", "顧", "孟", "平", "黃", "和", "穆", "蕭", "尹", "姚", "邵",
				"湛", "汪", "祁", "毛", "禹", "狄", "米", "貝", "明", "臧", "計", "伏", "成", "戴", "談", "宋", "茅", "龐", "熊", "紀", "舒",
				"屈", "項", "祝", "董", "梁", "杜", "阮", "藍", "閔", "席", "季", "麻", "強", "賈", "路", "婁", "危", "江", "童", "顏", "郭",
				"梅", "盛", "林", "刁", "鐘", "徐", "邱", "駱", "高", "夏", "蔡", "田", "樊", "胡", "凌", "霍", "虞", "萬", "支", "柯", "昝",
				"管", "盧", "莫", "經", "房", "裘", "繆", "幹", "解", "應", "宗", "丁", "宣", "賁", "鄧", "鬱", "單", "杭", "洪", "包", "諸",
				"左", "石", "崔", "吉", "鈕", "龔", "程", "嵇", "邢", "滑", "裴", "陸", "榮", "翁", "荀", "羊", "於", "惠", "甄", "曲", "家",
				"封", "芮", "羿", "儲", "靳", "汲", "邴", "糜", "松", "井", "段", "富", "巫", "烏", "焦", "巴", "弓", "牧", "隗", "山", "谷",
				"車", "侯", "宓", "蓬", "全", "郗", "班", "仰", "秋", "仲", "伊", "宮", "寧", "仇", "欒", "暴", "甘", "鈄", "厲", "戎", "祖",
				"武", "符", "劉", "景", "詹", "束", "龍", "葉", "幸", "司", "韶", "郜", "黎", "薊", "溥", "印", "宿", "白", "懷", "蒲", "邰",
				"從", "鄂", "索", "咸", "籍", "賴", "卓", "藺", "屠", "蒙", "池", "喬", "陰", "鬱", "胥", "能", "蒼", "雙", "聞", "莘", "黨",
				"翟", "譚", "貢", "勞", "逄", "姬", "申", "扶", "堵", "冉", "宰", "酈", "雍", "卻", "璩", "桑", "桂", "濮", "牛", "壽", "通",
				"邊", "扈", "燕", "冀", "浦", "尚", "農", "溫", "別", "莊", "晏", "柴", "瞿", "閻", "充", "慕", "連", "茹", "習", "宦", "艾",
				"魚", "容", "向", "古", "易", "慎", "戈", "廖", "庾", "終", "暨", "居", "衡", "步", "都", "耿", "滿", "弘", "匡", "國", "文",
				"寇", "廣", "祿", "闕", "東", "歐", "殳", "沃", "利", "蔚", "越", "夔", "隆", "師", "鞏", "厙", "聶", "晁", "勾", "敖", "融",
				"冷", "訾", "辛", "闞", "那", "簡", "饒", "空", "曾", "毋", "沙", "乜", "養", "鞠", "須", "豐", "巢", "關", "蒯", "相", "查",
				"後", "荊", "紅", "遊", "郟", "竺", "權", "逯", "蓋", "益", "桓", "公", "仉", "督", "岳", "帥", "緱", "亢", "況", "郈", "有",
				"琴", "歸", "海", "晉", "楚", "閆", "法", "汝", "鄢", "塗", "欽", "商", "牟", "佘", "佴", "伯", "賞", "墨", "哈", "譙", "篁",
				"年", "愛", "陽", "佟", "言", "福", "南", "火", "鐵", "遲", "漆", "官", "冼", "真", "展", "繁", "檀", "祭", "密", "敬", "揭",
				"舜", "樓", "疏", "冒", "渾", "摯", "膠", "隨", "高", "皋", "原", "種", "練", "彌", "倉", "眭", "蹇", "覃", "阿", "門", "惲",
				"來", "綦", "召", "儀", "風", "介", "巨", "木", "京", "狐", "郇", "虎", "枚", "抗", "達", "杞", "萇", "折", "麥", "慶", "過",
				"竹", "端", "鮮", "皇", "亓", "老", "是", "秘", "暢", "鄺", "還", "賓", "閭", "辜", "縱", "侴", "万俟", "司馬", "上官", "歐陽",
				"夏侯", "諸葛", "聞人", "東方", "赫連", "皇甫", "羊舌", "尉遲", "公羊", "澹台", "公冶", "宗正", "濮陽", "淳于", "單于", "太叔", "申屠",
				"公孫", "仲孫", "軒轅", "令狐", "鍾離", "宇文", "長孫", "慕容", "鮮於", "閭丘", "司徒", "司空", "兀官", "司寇", "南門", "呼延", "子車",
				"顓孫", "端木", "巫馬", "公西", "漆雕", "車正", "壤駟", "公良", "拓跋", "夾谷", "宰父", "穀梁", "段幹", "百里", "東郭", "微生", "梁丘",
				"左丘", "東門", "西門", "南宮", "第五", "公儀", "公乘", "太史", "仲長", "叔孫", "屈突", "爾朱", "東鄉", "相裡", "胡母", "司城", "張廖",
				"雍門", "毋丘", "賀蘭", "綦毋", "屋廬", "獨孤", "南郭", "北宮", "王孫" };
		
		
		int index = random.nextInt(Surname.length - 1);
		String name = Surname[index];

		if (random.nextBoolean()) {
			name += Chinese() + Chinese();
		} else {
			name += Chinese();
		}
		return name;
	}

	private static String Chinese() {
		String str = null;
		int highPos, lowPos;
		Random random = new Random();
		highPos = (176 + Math.abs(random.nextInt(71)));
		random = new Random();
		lowPos = 161 + Math.abs(random.nextInt(94));

		byte[] bArr = new byte[2];
		bArr[0] = (new Integer(highPos)).byteValue();
		bArr[1] = (new Integer(lowPos)).byteValue();
		try {
			str = new String(bArr, "GB2312"); 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}
}