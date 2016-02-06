package fci.arabicsignlangtoarabicspeech.scu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper {
	FeedReaderDbHelper Helper;

	public DbHelper(Context context) {
		Helper = new FeedReaderDbHelper(context);
	}

	public void insert() {
		// category of numbers

		insertData("61440", "0");
		insertData("61441", "1");
		insertData("61442", "2");
		insertData("61443", "3");
		insertData("61444", "4");
		insertData("61445", "5");
		insertData("61446", "6");
		insertData("61447", "7");
		insertData("61448", "8");
		insertData("61449", "9");

		// category of letters

		insertData("61452", "ا");
		insertData("61453", "ب");
		insertData("61454", "ت");
		insertData("61455", "ث");
		insertData("61456", "ج");
		insertData("61457", "ح");
		insertData("61458", "خ");
		insertData("61459", "د");
		insertData("61460", "ذ");
		insertData("61461", "ر");
		insertData("61462", "ز");
		insertData("61463", "س");
		insertData("61464", "ش");
		insertData("61465", "ص");
		insertData("61466", "ض");
		insertData("61467", "ط");
		insertData("61468", "ظ");
		insertData("61469", "ع");
		insertData("61470", "غ");
		insertData("61471", "ف");
		insertData("61472", "ق");
		insertData("61473", "ك");
		insertData("61474", "ل");
		insertData("61475", "م");
		insertData("61476", "ن");
		insertData("61477", "ه");
		insertData("61478", "و");
		insertData("61479", "ي");// / yaa2 maaad

		insertData("62098", "ا");
		insertData("62099", "آ");
		insertData("62100", "إ");
		insertData("62101", "ى");
		insertData("62102", "ؤ");
		insertData("62103", "ء");
		insertData("62104", "ئ");
		insertData("62105", "ة");
		insertData("62108", "لآ");
		insertData("62109", "لأ");
		insertData("62110", "لإ");
		insertData("62111", "لا");
		// Space
		insertData("160", " ");

		// category of family

		insertData("61481", "أب");
		insertData("61482", "أم");
		insertData("61483", "زوج");
		insertData("61484", "زوجة");
		insertData("61485", "ابن");
		insertData("61486", "ابنة");
		insertData("61487", "أخ");
		insertData("61488", "أخت");
		insertData("61489", "جد");
		insertData("61490", "جدة");
		insertData("61491", "ابن العم");
		insertData("61492", "ابن العمة");
		insertData("61493", "ابن الأخ");
		insertData("61494", "ابن الأخت");
		insertData("61495", "ابن الخال");
		insertData("61496", "ابن الخالة");
		insertData("61497", "أسرة");
		insertData("61498", "ولادة");
		insertData("61499", "توأم");
		insertData("61500", "رضيع");
		insertData("61501", "حفيد");
		insertData("61502", "حفيدة");
		insertData("61503", "متزوج");
		insertData("61504", "متزوجة");
		insertData("61505", "أعزب");
		insertData("61506", "طلاق");
		insertData("61507", "أرملة");
		insertData("61508", "انفصال");
		insertData("61509", "طفل");
		insertData("61510", "اطفال");
		insertData("61511", "شاب");
		insertData("61512", "السن");
		insertData("61513", "أقارب");
		insertData("61514", "وفاة");
		insertData("61515", "ينمو");
		insertData("61516", "يتيم");
		insertData("61517", "ناس");
		insertData("61518", "شخص");
		insertData("61519", "صغير السن");
		insertData("61520", "كبير السن");
		insertData("61521", "صديق");
		insertData("61522", "عريس");
		insertData("61523", "عروسة");
		insertData("61524", "عجوز");
		insertData("61525", "خال");
		insertData("61526", "خالة");
		insertData("61527", "عم");
		insertData("61528", "عمة");
		insertData("61529", "ولد");
		insertData("61530", "بنت");
		insertData("61531", "رجل");
		insertData("61532", "امرأة");

		// category of Arts

		insertData("61534", "دف");
		insertData("61535", "طبل");
		insertData("61536", "اخبار الحوادث");
		insertData("61537", "اخبار الرياضة");
		insertData("61538", "الة القانون");
		insertData("61539", "جريدة الاخبار");
		insertData("61540", "جريدة الأهرام");
		insertData("61541", "جريدة الجمهورية");
		insertData("61542", "حسين فهمى");
		insertData("61543", "عبدالحليم حافظ");
		insertData("61544", "فريد الاطرش");
		insertData("61545", "مجلة حواء");
		insertData("61546", "محمد صبحى");
		insertData("61547", "مزمار");
		insertData("61548", "اسماعيل يس");
		insertData("61549", "اكورديون");
		insertData("61550", "ام كلثوم");
		insertData("61551", "بيانو");
		insertData("61552", "جاز");
		insertData("61553", "جريدة المساء");
		insertData("61554", "جيتار");
		insertData("61555", "عادل امام");
		insertData("61556", "عود");
		insertData("61557", "فريد شوقى");
		insertData("61558", "كمان");
		insertData("61559", "كونترباس");
		insertData("61560", "مجلة الاسرة");
		insertData("61561", "مجلة الشباب");
		insertData("61562", "محمود يس");
		insertData("61563", "مسرح");
		insertData("61564", "نوتة موسيقية");
		insertData("61565", "نور الشريف");

		// category of Directions

		insertData("61567", "أسفل");
		insertData("61568", "أعلى");
		insertData("61569", "الداخل");
		insertData("61570", "الدخول");
		insertData("61571", "أمام");
		insertData("61572", "بعد");
		insertData("61573", "بعيد");
		insertData("61574", "بوصلة");
		insertData("61575", "بين");
		insertData("61576", "تحت");
		insertData("61577", "جانب");
		insertData("61578", "جنوب");
		insertData("61579", "حول");
		insertData("61580", "خلف");
		insertData("61581", "شرق");
		insertData("61582", "شمال");
		insertData("61583", "عالي");
		insertData("61584", "غرب");
		insertData("61585", "فوق");
		insertData("61586", "قبل");
		insertData("61587", "قريب");
		insertData("61588", "منخفض");
		insertData("61589", "هنا");
		insertData("61590", "هناك");
		insertData("61591", "وسط");
		insertData("61592", "يسار");
		insertData("61593", "يمين");
		insertData("61594", "مكان");

		// category of Food
		insertData("61596", "شطة");
		insertData("61597", "حساء");
		insertData("61598", "بامية");
		insertData("61599", "بطاطا");
		insertData("61600", "بطاطس محمرة");
		insertData("61601", "بطاطس مهروسة");
		insertData("61602", "تين شوكي");
		insertData("61603", "خيار");
		insertData("61604", "رمان");
		insertData("61605", "شاورمة");
		insertData("61606", "طعمية");
		insertData("61607", "عنب");
		insertData("61608", "فلفل حار");
		insertData("61609", "فلمنك");
		insertData("61610", "فول سوداني");
		insertData("61611", "فشار");
		insertData("61612", "فينو");
		insertData("61613", "قرفة");
		insertData("61614", "كركدية");
		insertData("61615", "كرنب");
		insertData("61616", "كشري");
		insertData("61617", "كفتة مشوية");
		insertData("61618", "كيكة");
		insertData("61619", "لسان عصفور");
		insertData("61620", "موزة");
		insertData("61621", "نيسكافية");
		insertData("61622", "همبورجر");
		insertData("61623", "ينسون");
		insertData("61624", "أرز");
		insertData("61625", "أناناس");
		// __________________________
		insertData("61626", "بسلة");
		insertData("61627", "بطيخ");
		insertData("61628", "بلح");
		insertData("61629", "تفاح");
		insertData("61630", "تين");
		insertData("61631", "ثوم");
		insertData("61632", "جزر");
		insertData("61633", "جمل");
		insertData("61634", "دجاج");
		insertData("61635", "سمك");
		insertData("61636", "شعرية");
		insertData("61637", "عدس أصفر");
		insertData("61638", "عسل أبيض");
		insertData("61639", "عسل أسود");
		insertData("61640", "عيش");
		insertData("61641", "فلفل أسود");
		insertData("61642", "جبنة فلمنك");
		insertData("61643", "قرموط");
		insertData("61644", "لب أسمر");
		insertData("61645", "لحم كفتة");
		insertData("61646", "لحم");
		insertData("61647", "باذنجان أبيض");
		insertData("61648", "بقر");
		insertData("61649", "بريل");
		insertData("61650", "جمبري");
		insertData("61651", "حساء شوربة");
		insertData("61652", "دقيق");
		insertData("61653", "ذرة");
		insertData("61654", "زيت");
		insertData("61656", "سكر");
		// ________________________
		insertData("61657", "شاي");
		insertData("61658", "طرشي");
		insertData("61659", "فريك");
		insertData("61660", "فاصوليا بيضاء");
		insertData("61661", "فول");
		insertData("61662", "كنتالوب");
		insertData("61663", "لب أبيض");
		insertData("61664", "لبن");
		insertData("61665", "لوبيا");
		insertData("61666", "مانجو");
		insertData("61667", "مكرونة");
		insertData("61668", "ملح");
		insertData("61669", "بطاطس");
		insertData("61670", "بيبسي");
		insertData("61671", "جوافة");
		insertData("61672", "جوز هند");
		insertData("61673", "حمص الشام");
		insertData("61674", "خرشوف");
		insertData("61675", "خس");
		insertData("61676", "سبانخ");
		insertData("61677", "ستيلا");
		insertData("61678", "عيش غراب");
		insertData("61679", "فاصوليا خضرا");
		insertData("61680", "فراولة");
		insertData("61681", "فلفل رومي");
		insertData("61682", "قلقاس");
		insertData("61683", "قهوة");
		insertData("61684", "كمثرى");
		insertData("61685", "كوسة");
		insertData("61686", "مشمش");
		// _______________________
		insertData("61687", "ملوخية");
		insertData("61688", "ميرندا برتقال");
		insertData("61689", "نعناع");
		insertData("61690", "يوسفي");

		// category of Jobs

		insertData("61692", "سائق");
		insertData("61693", "نجار");
		insertData("61694", "الاسم");
		insertData("61695", "البطاقة الشخصية");
		insertData("61696", "البطاقة العائلية");
		insertData("61697", "العنوان");
		insertData("61698", "المؤهل");
		insertData("61699", "بطاقة التأمين");
		insertData("61700", "ترزي");
		insertData("61701", "تعيين");
		insertData("61702", "جواز سفر");
		insertData("61703", "دكتور");
		insertData("61704", "راقص");
		insertData("61705", "رخصة قيادة");
		insertData("61706", "رخصة محل");
		insertData("61707", "رقم التليفون");
		insertData("61708", "رقم الفاكس");
		insertData("61709", "رقم");
		insertData("61710", "سباك");
		insertData("61711", "شهادة ميلاد");
		insertData("61712", "طالب");
		insertData("61713", "عقد");
		insertData("61714", "عمل");
		insertData("61715", "فراش");
		insertData("61716", "فلاح");
		insertData("61717", "فني");
		insertData("61718", "كميائي");
		insertData("61719", "لحام");
		insertData("61720", "محاسب");
		insertData("61721", "مدرس");
		insertData("61722", "مهندس");
		insertData("61723", "مهنة");
		insertData("61724", "موظف");
		insertData("61725", "ميكانيكي");
		insertData("61726", "نقاش");

		// category of Events

		insertData("61728", "خطوبة");
		insertData("61729", "عيد الحب");
		insertData("61730", "الزفاف");
		insertData("61731", "الزواج");
		insertData("61732", "السبوع");
		insertData("61733", "الفاتحه");
		insertData("61734", "المولد النبوي الشريف");
		insertData("61735", "رأس السنة");
		insertData("61736", "شم النسيم");
		insertData("61737", "عيدالاضحى");
		insertData("61738", "عيد الثورة");
		insertData("61739", "عيد الجلاء");
		insertData("61740", "عيد السويس");
		insertData("61741", "عيد العمال");
		insertData("61742", "عيد الغطاس");
		insertData("61743", "عيد الفطر");
		insertData("61744", "عيد القوات المسلحة");
		insertData("61745", "عيد القيامة");
		insertData("61746", "عيد النصر");
		insertData("61747", "عيد تحرير سيناء");
		insertData("61748", "عيد خميس العهد");
		insertData("61749", "كتب كتاب");
		insertData("61750", "مهرجان السياحة و التسوق");
		insertData("61751", "هدية");

		// category of Sports

		insertData("61753", "الاهلي");
		insertData("61754", "الزمالك");
		insertData("61755", "الاتحاد السكندري");
		insertData("61756", "الاسماعيلي");
		insertData("61757", "الاولمبياد");
		insertData("61758", "بولينج");
		insertData("61759", "الجومباز");
		insertData("61760", "الجولف");
		insertData("61761", "الدوري العام");
		insertData("61763", "الرياضة");
		insertData("61764", "السباحة");
		insertData("61765", "الشراع");
		insertData("61766", "الشطرنج");
		insertData("61767", "الصيد");
		insertData("61768", "العارضة");
		insertData("61769", "الكاراتية");
		insertData("61770", "الكأس");
		insertData("61771", "المحلة");
		insertData("61772", "المصارعة الرومانية");
		insertData("61773", "المصارعة البورسعيدية");
		insertData("61774", "المقاولون العرب");
		insertData("61775", "الملاكمة");
		insertData("61776", "المنصورة");
		insertData("61777", "انبي");
		insertData("61778", "إنذار");
		insertData("61779", "اللاعب بيلية");
		insertData("61780", "تسلل");
		insertData("61781", "تنس الارضية");
		insertData("61782", "تنس طاولة");
		insertData("61783", "حكم");
		insertData("61784", "رفع الاثقال");
		insertData("61785", "ضربة جزاء");
		insertData("61786", "طرد");
		insertData("61787", "فاول");
		insertData("61788", "كارت أحمر");
		insertData("61789", "كارت أصفر");
		insertData("61790", "كأس العالم");
		insertData("61791", "كرة السلة");
		insertData("61792", "كرة الطائرة");
		insertData("61793", "كرة القدم");
		insertData("61794", "كرة الماء");
		insertData("61795", "كرة اليد");
		insertData("61796", "محمد علي كلاي");
		insertData("61797", "محمود الخطيب");
		insertData("61798", "منافسة");
		insertData("61799", "نادي الترسانة");
		insertData("61800", "هدف");

		// category of Colors

		insertData("61802", "أبيض");
		insertData("61803", "أحمر");
		insertData("61804", "أخضر");
		insertData("61805", "أزرق");
		insertData("61806", "أسود");
		insertData("61807", "أصفر");
		insertData("61808", "الألوان");
		insertData("61809", "برتقالي");
		insertData("61810", "بمبي");
		insertData("61811", "بني");
		insertData("61812", "ذهبي");
		insertData("61813", "غامق");
		insertData("61814", "فاتح");
		insertData("61815", "فضي");

		// category of Home

		insertData("61817", "اباجورة");
		insertData("61818", "ابرة");
		insertData("61819", "احذية حريمى");
		insertData("61820", "احذية رجالى");
		insertData("61821", "احذية");
		insertData("61822", "اريال");
		insertData("61823", "استشوار");
		insertData("61824", "اسفنج غسيل");
		insertData("61825", "الحمام");
		insertData("61826", "اسورة");
		insertData("61827", "الدش");
		insertData("61828", "انبوبة غاز");
		insertData("61829", "بدلة");
		insertData("61830", "بلوفر صوف");
		insertData("61831", "بنطلون جينز");
		insertData("61832", "بوتاجاز");
		insertData("61833", "بودرة تلك");
		insertData("61834", "تُرمس");
		insertData("61835", "ترمومتر");
		insertData("61836", "تسريحة");
		insertData("61837", "تفصيل");
		insertData("61838", "تلفزيون");
		insertData("61839", "توكة شعر");
		insertData("61841", "ثلاجة");
		insertData("61842", "جاكت جلد");
		insertData("61843", "جمالون");
		insertData("61844", "جيبة");
		insertData("61845", "حافظة طعام");
		insertData("61846", "حجاب");
		insertData("61847", "حرير");
		insertData("61848", "حقيبة يد");
		insertData("61849", "خلاط");
		insertData("61850", "خياطة");
		insertData("61851", "خيط");
		insertData("61852", "دولاب");
		insertData("61853", "رابطة عنق");
		insertData("61854", "روب");
		insertData("61855", "ساعة حائط");
		insertData("61856", "ستائر");
		insertData("61857", "سجاد");
		insertData("61858", "سخان");
		insertData("61859", "سرير");
		insertData("61860", "شاكوش");
		insertData("61861", "شامبو شعر");
		insertData("61862", "شبشب");
		insertData("61863", "شراب");
		insertData("61864", "شريط كاسيت");
		insertData("61865", "شمسية");
		insertData("61866", "طاولة مكواه");
		insertData("61867", "طاولة");
		insertData("61868", "طبق");
		insertData("61869", "عطر");
		insertData("61870", "عقدة");
		insertData("61871", "غاز طبيعى");
		insertData("61872", "غسالة أوتوماتيك");
		insertData("61873", "غسالة عادية");
		insertData("61874", "غطاء");
		insertData("61875", "فانلة ملابس داخلية");
		insertData("61876", "فتاحة علب");
		insertData("61877", "فرشاة");
		insertData("61878", "فرن");
		insertData("61879", "فنجان قهوة");
		insertData("61880", "فوطة");
		insertData("61881", "فيديو");
		insertData("61882", "فيشة كهربائية");
		insertData("61883", "قبعة حريمى");
		insertData("61884", "قبعة رجالى");
		insertData("61885", "قطن");
		insertData("61886", "قلة ماء");
		insertData("61887", "قمامة");
		insertData("61888", "قميص");
		insertData("61889", "كاميرا فيديو");
		insertData("61890", "كحل العين");
		insertData("61891", "كرافتة");
		insertData("61892", "كرسى");
		insertData("61893", "كريم شعر");
		insertData("61894", "كمبيوتر");
		insertData("61895", "كمودينو");
		insertData("61896", "لباس افرنجى");
		insertData("61897", "لباس بلدى");
		insertData("61898", "لمبة فلورنست");
		insertData("61899", "لمبة");
		insertData("61900", "مبرد مياه");
		insertData("61901", "مبشرة");
		insertData("61902", "مراّه");
		insertData("61903", "مروحة سقف");
		insertData("61904", "مروحة مكتب");
		insertData("61905", "مروحة يد");
		insertData("61906", "مريلة");
		insertData("61907", "مساحة");
		insertData("61908", "مشبك");
		insertData("61909", "مشترك كهرباء");
		insertData("61910", "مشط");
		insertData("61911", "مصفاه");
		insertData("61912", "مضرب بيض");
		insertData("61913", "معجون اسنان");
		insertData("61914", "مفرفة");
		insertData("61915", "مفتاح كهرباء");
		insertData("61916", "مفرش المائدة");
		insertData("61917", "مفرمة");
		insertData("61918", "مفك تيست");
		insertData("61919", "مفك عادى");
		insertData("61920", "مقشة");
		insertData("61921", "مقص");
		insertData("61922", "مقلاه");
		insertData("61923", "مكنسة");
		insertData("61924", "ملاحة");
		insertData("61925", "منبه");
		insertData("61926", "موبايل");
		insertData("61927", "ميزان أرضية");
		insertData("61928", "ميكرويف");
		insertData("61929", "نتيجة");
		insertData("61930", "نجف");
		insertData("61931", "نقاب");
		insertData("61932", "انتريه");
		insertData("61933", "براد شاى");
		insertData("61934", "حلق");
		insertData("61935", "حلة");
		insertData("61936", "خاتم");
		insertData("61937", "دبلة");
		insertData("61938", "سكين");
		insertData("61939", "شباك");
		insertData("61940", "شوكة");
		insertData("61941", "صالة");
		insertData("61942", "صالون");
		insertData("61943", "صحن");
		insertData("61944", "كبريت");
		insertData("61945", "كتاب");
		insertData("61946", "كوب");
		insertData("61947", "معلقة");
		insertData("61948", "مكواه");
		insertData("61949", "نظارة");

		// category of general

		insertData("61951", "ابدا");
		insertData("61952", "احيانا");
		insertData("61953", "ارجوك");
		insertData("61954", "استمرار");
		insertData("61955", "اسف");
		insertData("61956", "اشاعة");
		insertData("61957", "اقتراح");
		insertData("61958", "الاصلى");
		insertData("61959", "الاقدمية");
		insertData("61960", "الدفاية");
		insertData("61961", "الكل");
		insertData("61962", "الم");
		insertData("61963", "الماس");
		insertData("61964", "امر");
		insertData("61965", "انظر");
		insertData("61966", "او");
		insertData("61967", "ايهما");
		insertData("61968", "باب");
		insertData("61969", "بديل");
		insertData("61970", "برنامج");
		insertData("61971", "بطل");
		insertData("61972", "تجربة");
		insertData("61973", "تذاكر");
		insertData("61974", "تصفيق");
		insertData("61975", "تعالى احضر");
		insertData("61976", "تعويض");
		insertData("61977", "تقاعد معاش");
		insertData("61978", "تقريبا");
		insertData("61979", "تقرير");
		insertData("61980", "تليفزيون");
		insertData("61981", "تهجة الاصابع");
		insertData("61982", "توقف مؤقت");
		insertData("61983", "تليفون");
		insertData("61984", "جاسوس");
		insertData("61985", "جرس");
		insertData("61986", "جريدة");
		insertData("61987", "جزء");
		// /////////////////////////
		insertData("61988", "جمهور");
		insertData("61989", "حاجز");
		insertData("61990", "حائط");
		insertData("61991", "حتى");
		insertData("61992", "حديقة");
		insertData("61993", "حرية");
		insertData("61994", "حزين");
		insertData("61995", "حظ");
		insertData("61996", "حقيقة");
		insertData("61997", "حلاقة");
		insertData("61998", "خبير");
		insertData("61999", "خشب");
		insertData("62000", "خطأ");
		insertData("62001", "خطر");
		insertData("62002", "خيمة");
		insertData("62003", "درجة الحرارة");
		insertData("62004", "دعوة");
		insertData("62005", "راديو");
		insertData("62006", "رسالة بريد");
		insertData("62007", "زعلان");
		insertData("62008", "سكوت ");
		insertData("62009", "سلام");
		insertData("62010", "سؤال");
		insertData("62011", "شارع");
		insertData("62012", "شريط فيديو");
		insertData("62013", "شقة");
		insertData("62014", "شكرا");
		insertData("62015", "صابون");
		insertData("62016", "صحفى");
		insertData("62017", "صخرة");
		insertData("62018", "صوت");
		insertData("62019", "صور على الحائط");
		insertData("62020", "صورة");
		insertData("62021", "ضد");
		insertData("62022", "ضربة");
		insertData("62023", "طابع بريد");
		insertData("62024", "طريقة برايل");
		insertData("62025", "ظرف بريد");
		insertData("62026", "عقد");
		insertData("62027", "غير منتظم");
		insertData("62028", "فجأة");
		insertData("62029", "كاسيت تسجيل");
		insertData("62030", "كلمة");
		insertData("62031", "كيف");
		insertData("62032", "لأجل");
		insertData("62033", "لاشئ");
		insertData("62034", "لأن");
		insertData("62035", "لغة إشارة للصم");
		insertData("62036", "لقاء");
		insertData("62037", "لماذا");
		insertData("62038", "لو");
		insertData("62039", "ماذا");
		insertData("62040", "متى");
		insertData("62041", "مجلة");
		insertData("62042", "محادثة");
		insertData("62043", "مسجل بريد");
		insertData("62044", "مظرف");
		insertData("62045", "مع");
		insertData("62046", "معجزة");
		insertData("62047", "مفاجأة");
		insertData("62048", "مكتب بريد");
		insertData("62049", "ممكن");
		insertData("62050", "من");
		insertData("62051", "موسيقى");
		insertData("62052", "مؤقت");
		insertData("62053", "نسخة");
		insertData("62054", "نشرة اعلان");
		insertData("62055", "و");
		insertData("62056", "وعد");
		insertData("62057", "ولكن");
		insertData("62058", "يتحدث");
		insertData("62059", "يتشاجر");
		insertData("62060", "يتفاوض");
		insertData("62061", "يتكاثر");
		insertData("62062", "يتهم");
		insertData("62063", "يجبر");
		insertData("62064", "يحتج");
		insertData("62065", "يُخبر");
		insertData("62066", "يرحب");
		insertData("62067", "يرى");
		insertData("62068", "يُريد");
		insertData("62069", "يزيح");
		insertData("62070", "يستعجل");
		insertData("62071", "يشرح");
		insertData("62072", "يُصدق على");
		insertData("62073", "يُصر");
		insertData("62074", "يطلب");
		insertData("62075", "يُعارض");
		insertData("62076", "يقتبس");
		insertData("62077", "يُقدم");
		insertData("62078", "يقرأ");
		insertData("62079", "يلمس");
		insertData("62080", "يمشي");
		insertData("62081", "يملك");
		insertData("62082", "ينتشر");
		insertData("62083", "ينتظر");
		insertData("62084", "ينتظم");
		insertData("62085", "ينصح");
		insertData("62086", "ينقذ");
		insertData("62087", "ينهار");
		insertData("62088", "ينهض");
		insertData("62089", "يهجر");
		insertData("62090", "يهرب");
		insertData("62091", "يهزم");
		insertData("62092", "يهمس");
		insertData("62093", "يُوبخ");
		insertData("62094", "يُوزع");
		insertData("62095", "يُوقف");
		insertData("62096", "يُؤكد");

	}

	public void insertData(String unicode, String word) {
		SQLiteDatabase db = Helper.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(FeedReaderDbHelper.UNICODES, unicode);
		values.put(FeedReaderDbHelper.WORDS, word);
		db.insert(FeedReaderDbHelper.TABLE_NAME, null, values);
		Log.d("minaSamirInsert", unicode + word);
	}

	public void removeAll() {
		SQLiteDatabase db = Helper.getWritableDatabase();
		db.delete(FeedReaderDbHelper.TABLE_NAME, null, null);
	}

	public String getData(String unicode) {
		// select word from unicodestable where unicode ="?"
		SQLiteDatabase db = Helper.getWritableDatabase();

		String[] columns = { FeedReaderDbHelper.WORDS };
		String[] selectionArgs = { unicode };
		// table name, returned data form column, key to get the value,
		Cursor cursor = db.query(FeedReaderDbHelper.TABLE_NAME, columns,
				FeedReaderDbHelper.UNICODES + " =?", selectionArgs, null, null,
				null);
		StringBuffer buffer = new StringBuffer();
		while (cursor.moveToNext()) {
			int index = cursor.getColumnIndex(FeedReaderDbHelper.WORDS);
			String word = cursor.getString(index);
			buffer.append(word);
			break;

		}
		return buffer.toString();
	}

	// ///////match
	public boolean getDatamatch(String root) {
		boolean g = false;
		// select unicode, word from unicodes table
		SQLiteDatabase db = Helper.getWritableDatabase();

		String[] columns = { FeedReaderDbHelper.UNICODES,
				FeedReaderDbHelper.WORDS };

		Cursor cursor = db.query(FeedReaderDbHelper.TABLE_NAME, columns, null,
				null, null, null, null);

		while (cursor.moveToNext()) {
			int index1 = cursor.getColumnIndex(FeedReaderDbHelper.UNICODES);
			int index2 = cursor.getColumnIndex(FeedReaderDbHelper.WORDS);

			MainActivity.unicode = cursor.getString(index1);
			MainActivity.wordDB = cursor.getString(index2);
			if (root.equals(MainActivity.wordDB)) {
				g = true;
				MainActivity.uuu = MainActivity.unicode;
			}

			else if (match(root, MainActivity.wordDB)) {
				MainActivity.matchedSigns.add(MainActivity.unicode);
				MainActivity.words.add(MainActivity.wordDB);
				MainActivity.lengthword.add(MainActivity.wordDB.length());
				// MainActivity.len.add(MainActivity.word.length());
			}
		}
		return g;
	}

	public static boolean match(String rr, String ww) {
		boolean r = false;
		int counter = 0;

		for (int i = 0; i < rr.length(); i++) {
			String ch = rr.substring(i, i + 1);
			boolean s = ww.contains(ch);
			if (s) {
				counter = counter + 1;
			}
		}
		if (counter >= 3) {
			r = true;
		}
		return r;
	}

	// //////////
	static class FeedReaderDbHelper extends SQLiteOpenHelper {
		private static final String DATABASE_NAME = "keyboard";
		private static final int DATABASE_VERSION = 200;
		private static final String TABLE_NAME = "unicodes";
		private static final String UID = "_ID";
		private static final String UNICODES = "UNICODE";
		private static final String WORDS = "WORD";
		private static final String QUERY = "CREATE TABLE " + TABLE_NAME + " ("
				+ UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + UNICODES
				+ " VARCHAR(255), " + WORDS + " VARCHAR(255) );";
		private static final String DROP = "DROP TABLE IF EXISTS" + TABLE_NAME;
		private Context context;

		public FeedReaderDbHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			this.context = context;
			// Message.message(context,"constractor called");
			// Message.message(context, QUERY);
			Log.d("minaSamirDBhelper", QUERY);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			// Message.message(context,"onCreate is called");

			try {
				db.execSQL(QUERY);
				// Message.message(context,"onCreate is called");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Message.message(context, "" + e);
			}

		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			try {
				db.execSQL(DROP);
				// Message.message(context,"onUpgrade called");
				onCreate(db);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Message.message(context, "" + e);
			}
		}

	}
}
