package term_2_portfolio;
import java.util.Scanner;

/*
 * Gabriel Carlile
 * 10/18
 */

public class Switches {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Variables
	int year;
	
	//Input
	System.out.println("Please enter the year you were born.");
	year = input.nextInt();
	
	//Switch
	switch (year % 12) {
	case 0:
		System.out.print("   .         .  ...    .    .   .... . . ...... .  ................... ......  . .......  . ......  \r\n" + 
				"     ..   . ... .           .   . .. . . .  . .      ...,IZOOOOOOOZ~.... ..... . . .....    .       \r\n" + 
				"   .            .           .   . .. . . .  ....  ...+OOZZZZZOOOOZZZZZ+....... . . .....            \r\n" + 
				"  .. .       ..                 . .  . . .  ......=OOZOZZO+7ZZOZOZZOOOZOI:...... . .                \r\n" + 
				".. . .          .                        .  ....+OZOZZZZZ8,OZ~:OZ$ZOZOOOOOZ,...   ..                \r\n" + 
				"             .. .           .   . .. . . .  ...ZZOZZZZZZZZZZO7OZ:,ZZOZZOOOOO+...........            \r\n" + 
				"   . .                          . ..     . . .,OZZZOZ7=~::~?ZZZZZZZ,.OZZZZOOZ?......                \r\n" + 
				"  .. .                               . . . . ..=OZ8,....,.....+OZZ?IOOOOZZZZZZ~......               \r\n" + 
				"              . .           .   . .. . . .  ....ZZ7???==,.......ZZZO=.:ZZZZZZZO:........            \r\n" + 
				"   . .       .. .           .   . ... ..........OZZOO:.,.+:.....,OZZOOOOZZZZZZZ$........            \r\n" + 
				"                .           .   . ............,7ZZZZZOZO+.+,.....ZZZO$,.=$ZZZZZO:.......            \r\n" + 
				"                .                  .........,7O$+OZZZZZZO~,?.....?OZZOZOOZZZZZZZ?...                \r\n" + 
				"   .         .. .   . ... ... . .......=ZOOOI,.,.Z7ZZO~:?.,~.....IZOZ7?+$OZZZZZZ$,..................\r\n" + 
				"                                   ....OZO=... ..8.,OZI,..:......OZZZO7$ZZZZZZZZZ,.........,....    \r\n" + 
				"   . .                             ...~O,,+...  .,I.:....$,.....?ZZO7I78OZZZZZZZZ,...,7OOOOO$,..    \r\n" + 
				"     .                             ...+O..  ........+II?:......?OOOZZ+.,OZZZZZOZ$...7ZO?,...:O:.....\r\n" + 
				". .. .                            ....=O..  ....?$:..........,ZZZZO?.IZOZZZZZZOO+.,ZZ:.......,Z.... \r\n" + 
				"   .                               ...:O=. .....$ZZZZ?:,.,,?ZOZZZOZO7,ZZZZZZZZZ$,,Z+.........:Z.....\r\n" + 
				"                                   ....OO~.....~ZZZZZOZZZZZOZZZ7O?.,OZZZZOZ8ZZO~.7?.....  ...=+. .. \r\n" + 
				"              . .           .   . .....+ZO$~,~7OZOZZZO$ZZZZZ+OO.~ZOZOOOZZZ=.=OO,=$,.....  ......  ..\r\n" + 
				"   .         .  .           .   . ......IZZZZZZZZZ,7O.+OI.7Z.+Z$7ZZZZZ?~ZZO:.~O7Z~......  ...... .  \r\n" + 
				"                                   ......IZZZZZZZO=ZZ:?Z$.ZZ?+ZZZZ~=ZZ:.OZO~..ZZZ,...       . .     \r\n" + 
				"                                    ......:7ZZZZZZZZZOZZOZZZZZZZZZ7,...+ZZO,..ZZ$...                \r\n" + 
				".  .                                 .......=OZZZZZZZZZZZZZZZZOZZZZZ=,7OZ$I...OZ7. .                \r\n" + 
				"                                        ....,ZZZZZZZZZZZZZZZZZZOZ,=OOZZZ,,...Z=$7. .                \r\n" + 
				"                                       . ..IZZZZZZZZZZZZZOZ$7+=?Z=..,?,...,,$,.$7...                \r\n" + 
				"                    ........           ...7$ZZOZZOOZZZZZOZO,. ....$,,....,O~,..?O,..                \r\n" + 
				"                    ..........         ..=ZZZZZZOO:~$,O$OZZ7..   ..,7OOZ+:,....:Z~..                \r\n" + 
				"   .             ......,$Z,..... .  .....8$ZZZZ+.=....ZZOZOZ$... ....... .. ....ZI....              \r\n" + 
				"                .....,:OZZO7...... .....=ZZZZO,.,:.$Z$ZZ$ZOZZOI.,..... .      ..IZ,.....            \r\n" + 
				"   . .          ....:7OZOZZZ8:,...  ....$ZZZZZO~OZZZZZZZZ=OZZZZ$O=,... .     ...~O+....             \r\n" + 
				"               ...,7ZOZZZZZOZO=... ....:ZZZZZZZZZZZZ$O=...ZZZZZZZZZZZ7=,....,....Z$.....            \r\n" + 
				"               ..+OOOZZZOOZZZZZ$.......$ZZZZZZZZZZ7~.,,.Z$OZZZZZZZZZZZZOOOO~.....?O:.. .            \r\n" + 
				"   .           .7ZZZZO?,..=OZZZZ7.....,O$ZZZZZZZZZZ,.ZZZZZZZZZZZZZZZZZZZZZ$......:O+..              \r\n" + 
				"           ....=ZZZZZZ=.,..=OZZZO=...,=ZZZZZZZZZZZZZ?ZZZZZZO7$ZZZOZZZZZZZZ=..... .Z7..              \r\n" + 
				"           ...+ZOZOOZZI.....~OZZOZ~..:ZZOZZZZZ$,ZZZZOZOZIO,..+ZZZI:=$ZZZZO.... . .?O:...            \r\n" + 
				"            .:ZZZ$,ZZOO......?ZZZZO,,ZZZZZZZZOO,~ZZZZ$Z7....~?ZZZ$..?ZZZZ?...... .:Z?. .            \r\n" + 
				"           ..:OOO.,$OO$=..  ..$OZZZZZ$ZZZZZ$Z~$=.=ZOZ8:.,8:~OZZZOZ:.+ZZZ7,..     ..7O,..            \r\n" + 
				"  .... .   ...+Z$.........  ...O$ZZZZZZO$ZZZ..~$=.=O$OOOIOZOZZO=O$O:+ZZZ+...     ..+Z+....          \r\n" + 
				"   .        ..,OZ.........  ...,OZZOZZZZZZZI...,O7.,OZOZZZZOO?:,~ZZZZZZZ=...     ..:O$.....         \r\n" + 
				"  ..   .    ...OZ7... ....  ....,IOZZZZZZZZ?.....ZZ:.$$ZZOZ~.:,=.OZZZZOZ+.        ..$O~....         \r\n" + 
				"       .   ....OZZO$$$+..   .......~ZZ$ZZZZ+.....,~Z$,+ZZO~..?,ZOZZZZZZZ7,..      ..IZI.....        \r\n" + 
				"....   .   ....,~=+?$7....     ..:~+7ZZZZZZ7~,.,....=OZZOOOI~ZZO?OZZZZZZOI..........~OZ,...         \r\n" + 
				"           ...............     ..$ZOOOZZZZZZOZOOOZ?,.,ZZOZZOZZO,~O~,+OZZZO,.........,ZO=....        \r\n" + 
				".           ............ .      .+ZZZZZZZZZZZZZZZZZZOOZZZOOZZZ$.+7:Z:,~OZZZ.....~....ZZ?....        \r\n" + 
				"                               ...,+OZZOZZZZZZZOZZZO$$ZZZO$OI.=I+ZOI+:,=OZZ$:..=O....$ZI....        \r\n" + 
				".                               .....:?ZZZZZZZO=..+ZZO7:.=OZZ$.,OZZZ~?OZZZZZZOOZO:...$Z$...         \r\n" + 
				"   .                            ..  ...,ZZZOZZZZZ:IOZZO?.=OZZII=,7~II.7ZZZZOZOZZZ~...ZZ$,...        \r\n" + 
				"  ..                                .....:8ZZZZZZZZOZO=..IZZZO=:I$.,O,ZZZZ+.,O7,....~OOI....        \r\n" + 
				"                                    .......$ZZZZZZZZOOOZ:?OZO$ZZZ~~8ZOZOOO+.........$OO=....        \r\n" + 
				"  .    .                                ....=ZZZOZZZZOZZZZZZOZZZZOZZZOZOZZO,.......7OZ$.....        \r\n" + 
				"   .                                    .....:ZZOZZZ?..,~$OZOZZZZZZZZZZOOOZO:..,.~OOZZ,....         \r\n" + 
				"  ......                                 .....,OZZZZZ.......=OZZZZZZZZZ:,=8ZOOOOZZOZ$.......        \r\n" + 
				"....   .                                     ..:OOZOZ:....  ..,OOZZZZZZZ...:$OOOZ7~...              \r\n" + 
				"                                            ....?ZZZZZ....   ...=ZZZZZZZ$~............ .            \r\n" + 
				"                            .......:====~:,.....,OZZZZ,..........:OZOZZZZO,.....                    \r\n" + 
				"... .. .                    ....,+ZZOOOOOOZ$?=,..OZZZZ:.:?7$7+~,..$OZOZZZO~.....                    \r\n" + 
				"  .. . .                    ...?OZOZZZZZZZOZZZOZOZZZZOZZZZOZOZOZOI:OOOZOOZO.....     .   .....     .\r\n" + 
				" ...   .                    ..,OZZZZOZOZOOZZZOZZZZZOOZOZZOZOOZOOOZOOOZZOOOO:.....    .    .. .      \r\n" + 
				"                            ..=OZ$7I+==~::~=+$OOOOOZO?ZOOOOOZOOOOZOOOOOOOOO=....         \r\n " +
				"You are a Monkey! Those born under the Chinese Zodiac sign of the Monkey thrive on having fun. \r\n" +
				"They’re energetic, upbeat, and good at listening but lack self-control. They like being active \r\n" +
				"and stimulated and enjoy pleasing self before pleasing others. They’re heart-breakers, not good \r\n" +
				"at long-term relationships, morals are weak. Compatible with Rat or Dragon.");
		break;
	case 1:
		System.out.println("                                       .......,Z$$ZI.........                                     \r\n" + 
				"                                         ..$$+.Z$Z$$$$,.....Z...                                    \r\n" + 
				"                            ....   ...ZZ..$$$$$$$$$$$$$...Z$.......                                 \r\n" + 
				"                            ..+.   ..Z$$$$$$$$$$$$$$$Z$$Z$$$.. ....                                 \r\n" + 
				"                            . $$...,$$$$$$$$$$$$Z$~.Z$$$$$I$...Z...                                 \r\n" + 
				"                            ..Z$Z$$$$$$$$$$$$$$$Z=ZZZZ$$$$.ZZ=$Z...                                 \r\n" + 
				"                            ..?$$$$$$$$$$$$$Z$$Z$$$?.Z$Z$$I.Z$$=...                                 \r\n" + 
				"                            ...Z$$$$$$$$$$$$$$=..$Z.ZZ.~Z$$$7$$Z...                                 \r\n" + 
				"                            ....$$$$$$$$$$$$$=.. Z$I,Z$Z$$$$$$$$Z?....~ZZZZZZ...                    \r\n" + 
				"                            .....$$$$$$$$$ZI.....Z$$$:.=Z$$$$$$$$$$$$$Z$$$$$$$,.                    \r\n" + 
				"                                ...IZZZZ~...    .$IZZZ$$$$..$$$$$$$$$$$$$$$$Z$$.                    \r\n" + 
				"                                ...... .....    .Z..$$$$$Z..$$Z.Z.Z$$$$$$$$$$Z..                    \r\n" + 
				"                                                .Z+..=Z$~..7$$Z ZZ..~$Z$$$Z$$Z..                    \r\n" + 
				"                                                .7Z$......Z$$$$$.IZ+.......Z$ZZ.                    \r\n" + 
				"                                                .,$$$$$$$$$$=.Z$+..7Z$ZZZZ$$$$Z....                 \r\n" + 
				"                                                ..$Z.?$$$$$Z..Z$$$:......Z$$$$$$..                  \r\n" + 
				"                                                ..Z$=...~~....Z$$$ZZZZZZ$$$$$$$$$$Z~.....           \r\n" + 
				"                                                ...Z$Z,.....~Z$$$?.~$$$$$$$$$$$$$$$$Z7...           \r\n" + 
				"            . .....                                :$Z$$$$$$$$$$Z...$$$$$$$$$$$$$Z,Z:,?Z....        \r\n" + 
				"            ..... .                                .ZI,$$$$$$$$$?...$$$$$$$$$I.Z7.$..?$$$$..        \r\n" + 
				"         ....~,.                                   ..$Z...~IZ$+....$$$$$$$$Z$$..~~,.$$$Z..$Z....    \r\n" + 
				"         ..=Z...                                   ...$$Z,.......,Z$$$$$Z.ZZ.Z=.Z.7..Z$$, .7Z~..    \r\n" + 
				"         .Z$+...         .............                ..Z$$$ZZZZ$$$$Z$ZZ$Z.Z.Z.Z$$$$$7$$$$$$$$=.. . \r\n" + 
				"         .$$Z...         .............                ...~$Z$$$$$$$=$$$$$$.,.ZZ$$$$$$$$$$Z,Z$$:Z... \r\n" + 
				"         .$$$$,. .....=7ZZ$$$$$Z$$$$$ZZ=....             ..:$Z$$$$$Z.Z$Z.Z..Z$$$$Z$$,Z$$..,~Z$$$,.. \r\n" + 
				"         .$$:Z$$Z$$$$$Z7~,...,7Z$$$Z$$Z$$Z,.             ...,Z$$$$$$..$$.Z.,$$$$I$..Z$$Z...,$$ZZZ.. \r\n" + 
				"         .=$7...,,....+$Z$$$$$ZZ$Z$$$$Z+..+Z$...            ..Z$$$Z$=.$=.Z$$$$$Z.Z..Z$$$$$$$$ZZ..$. \r\n" + 
				"         ...$$Z7++$Z$Z~.....,ZZ~.....,Z$Z.ZZ$$:.            ...Z$$,7$.,.:Z$$$$$$.Z...$$$$$$$$$$Z.$  \r\n" + 
				"            ..,=?=...... ...,7$ZZI..+Z+,Z$$$$$$Z...         ...=$Z.?Z...Z$77$$$$+.Z:...:$$$$$$$$$$. \r\n" + 
				"            .... .......?Z$$$$$$$$Z7.Z$Z$$$$$I7Z:..         ....$$.Z$,.$Z7ZZ$$$$$Z.~Z$$Z$Z+Z$Z$$Z~. \r\n" + 
				"                ....:Z$$$Z?...ZZ$$$ZZ=Z$..Z$$,..Z..............,Z.$Z$=Z$$ZZ.$Z$$$$$$$$$$$$~..$$..,, \r\n" + 
				"                .,Z$Z$$, .,$$Z$$$$$$$Z$$$.+.$ZZ$$+.............ZIZ$$$$$$$$$$.7$$$$$$$$$$$$Z=....~Z, \r\n" + 
				"         ......$$$Z$...=Z$$Z$ZI...=$Z$Z$$$Z$$$$$$$IZZZ$$Z$Z7+Z$$$$$$$$$$$$$IZZ:Z$$$$$$$$$$Z,Z$Z$Z:. \r\n" + 
				"         ....ZZZ$...IZ$Z7+$$=.....$ZZ$~:=+Z$$$$$$ZZZ.=$7 .$$$.7Z..$$$$7+Z$$$Z,$IZ$Z$$$$$$Z$Z$+:+Z$  \r\n" + 
				"         ..+$Z$...IZ$Z..Z$ZI.......ZZ$Z?,Z$$$$$$Z..?..Z7..Z$Z.+7..$$Z:I$Z$$$$$I=$$7$$$$$$$$$$$$$ZZ. \r\n" + 
				"      ....$$7...ZZZ$.7Z$$Z$$$$$$$$ZZ$$$Z$7Z$$$$$Z..,$Z$ZZZZ..I$Z...Z::$$$$$$$$$$=7Z.$Z$$$$Z$$$$ZZ:. \r\n" + 
				"      ..Z$$..,Z$ZZ$$$$$$$$$$$$$$$Z$I$$Z7~7$$$$$$.7ZZ?..IZ$$..~Z=$ZZZ.7$$$Z$$$$$$Z$IZZ.Z$ZZ=Z.Z+I$.. \r\n" + 
				"   ....ZZ,..$$Z:.=$Z,$$ZI..Z$Z$Z..?Z$ZZ$7?$$$$$=.~$ZZ...Z..ZZZ$..=$$?:$$ZZ,Z$$$$$$$$$Z$$$Z$$$$$$Z.. \r\n" + 
				"    ..ZZ. Z$$+..$$?.+$Z=.,$ZZZ:.....,+ZZ$$Z$$$$Z..Z..$Z$$.+$..ZZ$$$$$Z$ZZ$$I..+77+,.:+ZZ$$$$$$Z$Z.. \r\n" + 
				"   ..Z$.,Z$Z...IZ7.,$$..7$$$$7...=Z$$$$$+.?$$$$$$$$=.+?.$Z7Z..Z$$$$$$$$Z$$Z:$Z$I?I$Z$+..I$$$$$$$$.. \r\n" + 
				"   .?$..Z$+...$$I..Z$=.+$$$$Z.7Z$$$ZZ~$7?777I$$$$$$Z$Z$$Z$$$$$Z$$$$$$$Z$Z.ZZ$$$.$$$?Z$$$:.$Z$$$$... \r\n" + 
				"   .Z$.$$$....$$..Z$~.I$Z:.$Z$$$$$$I.$$$Z$$$$Z.$Z$$$$$$$$$$$$$$$$$$$Z$$$$7.$$?$ZZZ$Z$$77$ZZ$$$Z.... \r\n" + 
				"   .Z?:ZZ. ..Z$$..$Z..$Z..Z$$$$Z$Z+....$$$+ZI.7ZZ$$$7$$$$$Z$$$$$$$$$:$$$$$$$$Z=IZZ..I7ZZ$$$ZZ.....  \r\n" + 
				"   .Z7?$?   :Z$?.I$:.7Z:.Z$Z.ZZ$$$...7$$$?:ZZZ$Z$$ZZ,$~Z$Z~ZIZ$$$$$$~$$$$$$$$$$$$$$7Z?..ZZ$=....    \r\n" + 
				"   .~Z?Z?   I$$~.Z$.~$+.ZZ?.7$$Z$Z.7$$$$~.Z$~.7$$?ZZ.I$$?.$7.Z$$$$$Z.Z$$.Z$$$$$$$$$$$$$$$$$Z ...    \r\n" + 
				"   ..7$ZZ...?$$=.Z~.Z$..$Z..Z$7=$$$$$$$Z....7Z$$Z.ZZ$$~Z.7$~.Z$Z$$$$ZI$$.,$$$+$$$$Z$Z$$$$$$$:...    \r\n" + 
				"   ...Z$$Z...ZZ$:Z,.$Z.I$?.Z$$.Z$$$$$$$Z..,Z$$Z$$.I$Z.$$.$$Z...Z$$$$$7$ZZ:.Z$=?$$$.Z$$Z,$$$$Z...    \r\n" + 
				"      ..$$Z..~$Z:$:.$Z.ZZ.~ZZ.IZ$$$$$$$Z.+$$~.Z$Z..Z..Z$.?$I....$Z,....Z$$$$$Z..Z$=.Z$$I.Z$Z$=..    \r\n" + 
				"      ....Z$?.Z$+$I.$$,$Z 7$?.ZZ$$$$$$$$$$ZZ.ZZ$Z,....Z$,.ZZ........ ..Z$$$$Z$$$$$$$..Z$$,,$$Z..    \r\n" + 
				"         . ..$$$$$Z.$Z~$Z.Z$=.$$$$$$$$Z$$$$Z.Z$$$Z....Z$Z.+$$$ZZ7.....Z$$$$$$7Z$Z$$$$$$$$$$$$$ .    \r\n" + 
				"         .......Z$$$$Z~$Z.Z$$ Z$$$$$$$Z+$$$$7$$Z$$Z...Z$$$.?$ZZ$$ZZZZ$$Z$$$$+.$$$IZ$$$$$$$$$$$,.    \r\n" + 
				"    ....        .=$$$$?$$,7$$IZ$Z.$Z$Z...Z$$$$$$$Z$Z..$$$$..$Z.Z$$$$$$Z$$$$Z.I$$$.Z$$Z$Z$$$$$$=.    \r\n" + 
				"   ....:.       ..7$$$$$$$,$$$$$,.$$Z....I$$$$$$7.$$$ZZ$$$I.Z$ :$$$$$$$ZZZ..I$$$.:Z.Z$.I$$Z.~ZI.    \r\n" + 
				"....~Z...       ...$$$$ZZZ.Z$$$$..?$Z.  .=$,Z$$$7.Z$$$$ZZ$=.ZZ..$$$$$I,$$$?ZZ$ZZ:$,.7Z.~$$$..Z?.    \r\n" + 
				"...Z$+...       ...$$$$$I~$$$$$$?...Z....Z..ZZ$Z$.Z$Z$ZZ$Z..$7..7Z$$Z..Z$$$Z?~ZZ$I..Z$.$$.$:,$:.    \r\n" + 
				"..Z$Z.          ..$Z7.$$.Z$$$$$$Z.          . +$Z.I$.=Z.:ZI$$... .....:ZZ$....$Z....Z.$$..$:?$..    \r\n" + 
				" 7Z$$.          ..$$..ZIZ$ZZ$$$$Z$.         ..~$Z.$Z.:$IZ$$$ZZ,.   ..,$$I....I.....Z?Z$...$.ZZ..    \r\n" + 
				".$Z$Z...    ....+$Z..Z$$$Z..$$ZZ$$:...      ...=Z$$$$$$$$$$$$$$....ZZ$$,.       ..ZZZ.   .Z.Z,..    \r\n" + 
				":$$$$I...   ...7$Z.:$Z.Z$Z. :ZZ..ZZ. .      .......Z$$$$$$$$$Z$$Z$Z$$Z...       ......   ,$Z+...    \r\n" + 
				".ZZ$$$Z,.....=$Z.?$$?..I$:...$$I.7$7..             .=ZZ$$$$$$$$$$$$$..                ...7$Z        \r\n" + 
				".:$$$$$$ZZZZ$$ZZ$$Z=...?=....?$$.IZZ..             ..Z7$Z$$$$$$$$$$I..                ...ZZ.        \r\n" + 
				"..:Z$$$$$$$$$$$$Z..   ...   .+$Z.Z.Z..             ..IZZ,.Z$$$$$$$,                   ..,Z..        \r\n" + 
				".....~ZZZZZZ:..=Z..   ...   .$$$,Z.Z.              ..Z.,$Z$$.,?Z$7.                   ..Z...        \r\n" + 
				"            ...=$~..........7$$$$Z=$..             .:$$:.$$ZZZZZI..                                 \r\n" + 
				"            ....$Z.........$$$$$$$$$..             .$,:Z$$$Z$$..~..                                 \r\n" + 
				"                $Z$$,..~$$$$$$$~$Z$Z..          ..,$Z7ZZ7$$$.$$$,..                                 \r\n" + 
				"                .Z$$$$$$Z$$Z....Z$$~..          ..IZ.$Z.$$$Z$+.I. .                                 \r\n" + 
				"                ..,$ZZZI.   ....$$?   .............+Z+.Z$$Z.7ZZZ...                                 \r\n" + 
				"                . .......   ...Z$Z.   ....~,......IZIZ$$.$$ZZ.:Z...                                 \r\n" + 
				"                .........   ..Z$?..   ..Z$$$ZZ$IZZ$77$$$?$+.Z.+$...                                 \r\n" + 
				"                            ..Z....   .,$$$$:Z:.Z$.7$.=Z.+7,Z:Z$Z~....                              \r\n" + 
				"                            . .....   .,..~ZZ$ZZZZ?~...ZZ$.I..ZZ.Z$Z..                              \r\n" + 
				"                                         ...............$ZI$ZZ~ZZ.....  .                           \r\n" + 
				"                                         ..........,IZZZZ..ZZZ:?7.......                            \r\n" + 
				"                                         ...,ZZ.$Z.7..7.~ZZZ..ZZ.~I$?Z.:Z$..                        \r\n" + 
				"                                         ...$ZZ$ZZ.7Z$$$ZZZ$II$ZZZ$Z.=Z$..7.                        \r\n" + 
				"                                         .......+II+,..............,......Z+                        \r\n" + 
				"                                         .................. ................ \r\n"+
				"You are a Rooster! Those born under the Chinese Zodiac sign of the Rooster are practical, resourceful, \r\n" +
				"observant, analytical, straightforward, trusting, honest, perfectionists, neat and conservative. \r\n" +
				"Compatible with Ox or Snake");
		break;
	case 2:
		System.out.println("                                                                                                 \r\n" + 
				"                                                                           .........                \r\n" + 
				"                                                                       ...?:.O:::,:?.+.,..          \r\n" + 
				"                ....                                               ..:+:?Z7+$$$$$Z$7?O?~....        \r\n" + 
				"               ..OI...                                             ....?$$$$$$$$$$$$$$$7I=...       \r\n" + 
				"            .  .,Z7Z,.                                             ..I$$$$$$$$$$$$$$$$$$$Z+7..      \r\n" + 
				"           .$?...Z.,$?..                                           .7$Z$$$$$$$$$$$$$$$$$$$$ZI.      \r\n" + 
				"           .==$7.Z..I$$:..                                         ..$$$$$$$$$$$$$$$$$$$$$$$O...    \r\n" + 
				"           .+..Z$O.:.$Z$,...                                     ..,O$$$$$$$$$$$$$$$$$$$$$$$Z?:.    \r\n" + 
				"           ..+~~$$:=+.O$$+ .                                      ..O$$$$$$$$$$$$$$$$$$$$$$$$Z..    \r\n" + 
				"            .I~I?$I7+I:$$$?.                                       .I$$$$$$$7~,:7$$$$$$$$$$$$Z.,    \r\n" + 
				"           ...O$$$$$$$$$$$$Z..                                     ..Z$$$Z,.     ..7$$$$$$$$$$$..   \r\n" + 
				"         ...?Z$$$$$$$$$$$$$$:...                                     .Z$Z.         .Z$$$$$$$$$O...  \r\n" + 
				"         ..O$$$$$$$$$$$$$$$$$$O:..                                   . ,,.         .,$$$$$$$$$$?..  \r\n" + 
				"          ~$$$$$$$$$$$$$$$$$$$$$7.                                     ...         ..$$$$$$$$$Z...  \r\n" + 
				"          Z$+$ZZ?$$$$$$$$$$$$$$$I$Z,..                                             .Z$$$$$$$$$Z,..  \r\n" + 
				"       ..I$$$7Z.$$$$$$$$$$$$$$$$~I$$I...                                         ..,Z$$$$$$$$Z..    \r\n" + 
				"   ... 7$$$$$$$$$$$$$$$$$$$$$$$$,~Z$~$Z...                   .......... ..........7$$$$$$$$$ZO,.    \r\n" + 
				"  ...IZ$$$$$$$$$$$$$$$$$$$$$$$$Z.=Z$.+$$= ....  ..    ........:+ZZZ$$$$$?$$$O=..,O$$$$$$$$$7....    \r\n" + 
				" ..~Z$$$$$$$$$$$$$$$$$$$$$$$$$$:~?$$.=I$$IZZ$+~,,.......?OZ$$$$$$$$$,:Z..,Z:~$$$$$$$$$$$7...        \r\n" + 
				" .:~=Z$$$$$$$$$$$$$$$$$$$$$$$Z~,=$$$.~?$$~=$$$$$$$$$$$$$$$$$$$$$$$$Z..$.+.Z..Z$$$$$$$$==~.          \r\n" + 
				"   .$$$$$Z$~Z$$$$$$$$$$$$$$$I.,+$$$Z,~+Z$+.?Z$$$$$$$$$$$$$$$$$$$$Z,..,$77$Z:..~Z$$$$$,..            \r\n" + 
				"   ..?7$IZ$$$$$$$$$$$$$$Z$I.,=?7$$$~,:Z$$=.~$$$$$$$$$$$$$$$$$$$$$$+.++?$$$7++..$$$$$$$:.            \r\n" + 
				"   . ...?OZ$~.. .....$$O.,,,+I$$$$I.+~ZZ$,.,$$$$$$$$$$$$$$$$$$$$$$?7.+Z$$$$7,Z7$$$$$$$$~.           \r\n" + 
				"       . ...         ..ZI??$$$$$$?.,=Z$$Z..:I$$$$$$$$$$$$$$$Z$$$$$..$:?$$$+=I..Z$$I?$$$$..          \r\n" + 
				"                       .$$$$$$$$,.~?$$$$?..ZI$$$$$$$$$$$$$$$..Z$$Z$Z.:==$~=~,OZ$$$.+$$$$+.          \r\n" + 
				"                        ~$$$$ZI.:~?+$$$Z..~+$$$$$$$$$$$$$$$$,+?+:.$Z. ,$~$...$$$$+.+$Z7$Z.          \r\n" + 
				"                       ..Z$O,.~,7?+$$$$=.?,Z$$$$$$$$$$$$$$+.=$$$=OZ$$$$,.+Z$Z$$$+.:=$Z,Z$,..        \r\n" + 
				"                        .,Z..?I+Z$Z$$Z:.~~?Z$$Z.$$Z,$$$$$Z=.=$$$=,$$$$$$$$$$$$$+,+~$$?,I$=..        \r\n" + 
				"                         .Z$,IZ$$$$$O...~~$$$$~:$$$.?$$$$$$$=?+O...$$$$$$$$$Z?.,+7?ZO.,7$I..        \r\n" + 
				"                         ..Z$$$$$$Z:,,.~?$$$$+.~$$$.=$$$$$$$=.=$$$$$$$$$$$Z+.~,:?$Z$.,=$$+..        \r\n" + 
				"                          .~Z$$Z?..:I~,I$$$$=.,~$$Z.,O$$ZZ$$$$$$$$$$$$$$?....:Z=$$Z.~:?Z$~..        \r\n" + 
				"                          ..$$$,,.==7$?7$$$~.,?$$$I.+7$$.I$$$$$$$$$$$$$,,,7I+I$$Z:,,+?$$Z. .        \r\n" + 
				"                           ..O$$O=O7Z$$$$O..,IZ$$Z.=?7$$.=$$$ZI~$$$$$$$$$ZZZ$$$Z..+~I$$$:.          \r\n" + 
				"                              ~$$$$$$$$$.,~~$$$$Z..II$$7:$$O.. .$$$$$$$$$$$$$$+=?77$$$$$..          \r\n" + 
				"                               .Z$$$$$$$Z$$$$$$$.~~+$$$O$O...  .$$$$$$$$$$$$$$$$$$$$$$$O..          \r\n" + 
				"                               .Z$$$$$$$$$$$$$=,.?$$$$$$.. .   .Z$$$$$$$$$$$$$$$$$$$$$$+..          \r\n" + 
				"                               .$$$$$$$$$$$$$$$$$$ZZ7:...       7$$$$$$$$$$$$$$$$$$$$$$Z..          \r\n" + 
				"                               .$$$$$$$$$$$$$$:.......         ..+Z$$$$$$$$$Z ,O$$$$$$$$?.          \r\n" + 
				"                               .Z$$$$$$$$$$$$Z..                 ..?$$$$$$$$Z. ..O$$$$$$$+..        \r\n" + 
				"                                Z$$$$$$$$$$$$O..                   ..:O$$$$$$,.. ..=$$$$$$Z...      \r\n" + 
				"                               .$$$$$$.O$$$$$O.                    ....=$$$$$Z.. ...Z$$$$$$O..      \r\n" + 
				"                               .$$$$$O.:$$$$$=.                        .:$$$$$O.   .$$$$$$$$..      \r\n" + 
				"                             . :$$$$$,..$$$$$...                         Z$$$$$,   ..$$$$$$O..      \r\n" + 
				"                             ..I$$$$$. .$$$$Z.                         .,$$$$$I.   ..Z$$$$$~.       \r\n" + 
				"                             ..OIZ$Z.. .$$$$Z.                         .Z+Z$$Z..    .7$$$$Z.        \r\n" + 
				"                             .,:~,~... .$ZZZZ.                         ,,...Z...    .7$$$$I.        \r\n" + 
				"                             .I+~+$.    Z...Z.                       ..7=:~~,.     ..ZOZZZ:.        \r\n" + 
				"                          ..?ZZ$$$~.    Z~:~O.                   ...,O$$I??~..     .Z....+.         \r\n" + 
				"                       ...Z$$$$$$$~.  ..$7=?Z                  ...$$$$$$$$?.     ..,~:~=?I..        \r\n" + 
				"                       ...O$$$$$Z,.....=Z$$$Z..                ..,Z$$$$$Z:..    ..Z$$7$Z7...        \r\n" + 
				"                         .........  .~Z$$$$$$...                 ........      .~$$$$$$$Z.          \r\n" + 
				"                                   .Z$$$$$$$$,..                               .Z$$$$$Z$..          \r\n" + 
				"                                   .Z$$$$$O+..                                 .:7Z$~...            \r\n" + 
				"You are a Dog! Those born under the Chinese Zodiac sign of the Dog are loyal, faithful, honest, \r\n" +
				"distrustful, often guilty of telling white lies, temperamental, prone to mood swings, dogmatic, \r\n" +
				"and sensitive. Dogs excel in business but have trouble finding mates. Compatible with Tiger or\r\n " +
				"Horse.");
		break;
	case 3:
		System.out.println(",,,,,,,,,,.,,,,,,,,,,,,,,,,.,.+8.,..,,,,,,,,,,,,,.,,,,,...................,,,,,,,,,,,,,,,,,,,,,,,,,=\r\n" + 
				",,.......................,..ZOO8.,.....................................................,,,....,,,,.=\r\n" + 
				",....................,...ZOO$?OO.,...........,.,...................................................=\r\n" + 
				",.......................OOI,7.O8...............+O8.................................................=\r\n" + 
				",.....,................ZO:OO8.OOZ,.......,.,.OOOOI.................................................=\r\n" + 
				",..,,,.................8OZZOO+OO88OOOOD?..,?OOOOO=.................................................=\r\n" + 
				",.....,..............,.OOOZ8ZO8ZOOZOOZOZ8.DOZOOOO?.................................................=\r\n" + 
				",.............,....:OO8OOOOO8OO878OOOOOOOZOOOOOOO8.................................................=\r\n" + 
				",,,,..........,,.7OOOO8ZZOO8OIO$:+OOOOOO8ZO8$ZOOOO.................................................=\r\n" + 
				",,..,.,...,...,:OOOOOOOZZ:=...DOOO8OO8O7DZ$+OO$$ZO8,.................................,.............=\r\n" + 
				",,,.,.,,..:,.=IZ8OOOOOOOOOO8OOO8OO8OO87.8O.OO78.ZOO8.,................................,............=\r\n" + 
				"..,.OOO8I~88ZOOOOZOOOO8,...,O8ZOOOOOO8.O8.8OO.$8.ZOO8..................................8,..........=\r\n" + 
				"..$OO~..OZO8ZO8OOOOOOO=D8$8O:.ODOOOOOO.87.8OZ:.8$.8OO~.................................~8Z.........=\r\n" + 
				".,8OZ:,.OO..,O8IZ=OOOO8.,..,O7.DOOOOOZ7OZ:OOZO..D,$OO=.................................,?Z.........=\r\n" + 
				":,8OZOOOOZ..Z$O.D.8OOOZ$IOOI..8,:D8OOZOO8ZZZ8O7.?8.8OOD............I8OOOOOO88Z:......I$$+OI,.......=\r\n" + 
				",,8OOOO88ZOOO8+8+IOOOOOZZ8O888?O8=+OO8OOOOO$$8?.?Z.8OOOD........,OOOOOOOOOZOOOZO7..Z8$$8OZO.,......=\r\n" + 
				",,~O888OOOZOOOO788O8,8?OOOOOOOO8OZOOOOOOOOO88,.Z8::OOOOOZO8OO8OOZOOOOOZ88OOO8ZOOOOO8.,.,,8$88Z.....=\r\n" + 
				",.:,~IOOOOOOOOOOO8O~??$+8OOO8ZO=87OOOOOOOOO7:88$,.88~OZOOZOZOOZOOOOOOZ.OO...$OOOOOO8,,.~O8$OOO8..,.=\r\n" + 
				",.,,,,7OOO8I.~Z8OOO=?I:=+I8=~=$.D.+OOOOOOOZ8O8O78OO.OOOOOOOOOOOOOOO8~,.O~:D8O8O88O8OOOODI.,,8OO7.,.=\r\n" + 
				",.,,:8OOOOOOOOZ8OO88.D.:,~Z:.=..8.?OOOOOZO8.$888$,,OZOOOOOOOOOOOOOO8..OI.,.8O7O .,8OOOO,.:,,7ZZO...=\r\n" + 
				",::8OO88OO888Z+OOOOOZO87...,...8I7OOOOOOOOOO7....:OZZZOOOOOOOOOOOOOO:Z:...=.,:OO...8OOOO.,,,+ZZO...=\r\n" + 
				",,=88OO88$?IDOZOOOOOOZDOD88888OZO88OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOZ...7O8.:8.,.O8ZOOOOO...8OOI.,.=\r\n" + 
				".,,,:8ZOOO8OOOOOOOOOOO.7D88OOO8888:OOOOOOOOOO88OOZOOOOO8OOOOOOOOOOOOZ8...,888...D,.$OOOOD.DOOZO.,..=\r\n" + 
				",,,,,,88OOOO8O8ZOOOOO=D.,?=+OZ~,,.7~DOOOOOO8D8ZZ+.OOOO8I:.8ZOOOOOOOOOOOOOOO:.,ID7,~OOOOOOOOOO7.,..,=\r\n" + 
				",,,,:,7OO8DOOO8:OOOOOOD.+$?.D.=8.,+$ZOOOOOOOO8OOO~,8OZ8$...IOOOOOOOOOOOOOOO8~,..78OOOOOOZ8$=.,.....=\r\n" + 
				",,,,,,.88=IDOI~,~OOOOO8D.IOOO8Z$7.O8OOOOOOOOOO8OZ.,,OZ8OI,.,8OOOOOOOOZ8O88OOOOOOOOOOOOOOZD..,,...,.=\r\n" + 
				",,,,,,,7Z=,8?.ZI,8OODO==8OO,~OOD8OOOOOOOOOOOOOZ?, ..8OO$~~..,OOOOOO?.=7$?~..,I8OOOOOOOOOOO,,.......=\r\n" + 
				",,,,,,,+OD..,,?.OOOO.,:7OO?,.888+.+OOOOOOOOOOOO+..,.8OOOI==..8OOOOZOOOOOOOO8O..7OOOOOOOOZO,,.......=\r\n" + 
				",,,,,,,.8OOO8IZOOZ:$::.=8$8OOO8=Z.,:O?OOOOOOOOO88?,.8O8I,....DOOOOOOZ..8OZO8ZOO8=8OO8DOOOO.........=\r\n" + 
				",,,,,,,.OOOOOOOOOOI.=~=.~$OOZ,O:$.+?I+OOOOOOOOZ7OO,=OOZ$,...:OOOOOOO:...8OO,::OO$?OO8:OOOO..,......=\r\n" + 
				"...,,,,,=ZOOOOOOOOO88OOOO.,8:.8O888.ZOOOOOOOOZ+.,.,8OO88D8,.DOZOZ8O8D:8:O=.,.7OOOOOO8,OOOO.,.......=\r\n" + 
				".....,,,.DOOOOOOOOOOZOOOOZ.,,.8ZOZOOOOOOOOO8O:....OO8O$I$I..ZOOO8,.,,ZO8OO+,=OOOOZOOZ=OOO8.,.......=\r\n" + 
				",..,,,,.,=OOOOOOOOOOOOOOO.ODD?OZOOOOOO8O88+78D:.=8ZO8O,==:.DOOOO,~OD8O..IZO8OOOOOOO8,ZOOO8,........=\r\n" + 
				",.......,,8OOO.7O8OO8OOOOOOO8OOOOOOOOZ?=$8:,.,88OOO$IO+..$ZOOOOOOI.,OZ88888,.ZZZOOO?,8OO8..........=\r\n" + 
				",.......,,.8OO..7DO$,8OOO8O8OOZ8OOOOO8O88OZO8OOOO8?,?7$.DOOOOOOZOOOOD,8~8?.$+,8OOO$,.OZOI,.........=\r\n" + 
				"...........,IO8?,I.+:I$8OOOOOOOOOOOOOOOOOOOO$O8O:,Z~..+ODODZOOOOOOOOZ.:,IOOO88OO8=,,8OOZ.,.........=\r\n" + 
				"..........,..=Z=..,,I.DIZOOOOOOOOOOOOOOOOOOOOO,..,.,Z8O888=.OOOOOOOOO,,OOOOO8ZO8.,~OOZ8.,..........=\r\n" + 
				"..,.........,8O8$.,.O,~7.?7O8OOD,88OOOOOOOOOO8OOOOOOOOOO77I.OOO,78OOOOOOOOOO8~.:DOOOO+.............=\r\n" + 
				"..........,,OOO8O8=.DD.8.,,877O=D.DOOOOOOOO8OOOOOOOOOOZ.Z...8OOD.$O8OOOOOOOO8ZOOOZOO8,.............=\r\n" + 
				"...........8OOO~IOZ8?O8:Z..=.D8?.I.OOOOOOOD.88D8OZOO~8:~.,.,ZOOOO..$8OOOOOOOOOZOOOOOO.,.,..........=\r\n" + 
				".........,OZOOO..8OZOO8OOO.,,,.7.:,OOOOOOZZ7.D=,8I.O=+:.,.7OOOOOOO8?~.,+OOOOOZO:,..8ZD.,...........=\r\n" + 
				"..........OOOO8,=OOO8O888O8I..,...OOOOOOOOOO=.~,..8.=.=..8OOOO8OOOOOOOOOOOOOOOO..$~~O8~..,.........=\r\n" + 
				"....,.,.8OZ8OZI88O$8ON.,.OOOZOZOZOO8OOOOOOOZO8=......:OZOOOOOOOZ8DZOO888OOOZOOOOOOZOOO8............=\r\n" + 
				"...,,.ZOOO..ZOOO8=.ZO8.:8OOOOOOZOOOOOOOOOOOZOO8OO88ZOOO8ZOZOOOOZ..ZOOZ7,.:+ODOZOOOOOZO8............=\r\n" + 
				"....,88OOOZOZO=,.,..OOO88OOOO+8ZZI.$$ZO888OOOOOOOOO88O7,....OO8.:ZOOZ8.....,,.7OOOOOOO=.,..........=\r\n" + 
				"...,.Z~IOOZ8I,...,,,?8OOOOOO8.OOOOO,..,,............,.......OZOZ$OOO8.,........8OOOOOZ.,...........=\r\n" + 
				"...,.,.8OOD..,.........+ZO8DOOOOOOO.........................8OO8OOO7........,.,7OOOOO.,............=\r\n" + 
				"........,....,.......,.....,,,OOO:..........................OZDI=ZZ..........,.8OOOOO..............=\r\n" + 
				".......,..,.,................,.=OD.,.......................8OOZOOI?...........,8OOOOI..............=\r\n" + 
				"...........................................................D~.OOO................I8ZI.,............=\r\n" + 
				"............................................................,~$...,...............,~,,.............=\r\n" + 
				"...................................................................................................=\r\n" +
				"Those born under the Chinese Zodiac sign of the Boar are extremely nice, good-mannered and tasteful.\r\n"+
				" They’re perfectionists who enjoy finer things but are not perceived as snobs. They enjoy helping \r\n"+
				"others and are good companions until someone close crosses them, then look out! They’re intelligent, \r\n"+
				"always seeking more knowledge, and exclusive. Compatible with Rabbit or Ram.");
		break;
	case 4:
		System.out.println("MMMMMMMMMMMMMMMMMMMMMNZZZZZZZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMZZ7..$ZZZZZMMMMMMOZZZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMZZ..~ZZZZZZMMMDZZZ:..ZZZDMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMZZ.=ZZZZZZZMMZZZ.....ZZZZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMZZIZZZZZZZZDZZ$...=$$ZZZZZ8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMZZZZZZZZZZZZZZ,ZZZZZZZZZZZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMOZZZZZZZZZZZZZZZZZZZZZZZZZZOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMDZZ$$$ZZZZZZZZZZZZZZZZZZZZZZZZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMOZZZZ......ZZZZZZZZZZZZZZZZZZZZZZOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMNZZZZZZZZ...   ZZZZZZZZZZZZZZZZZZZZOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMOZZZZZZZZZZZZ$I7$ZZZZZZZZZZZZZZZZZZZZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMZZZZZZZZZZZ..$ZZZZZZZ..ZZZZZZZZZZZZZZZZZZZOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"ZZ:ZZZZZZZZZZZZZ:.  .:ZZ,ZZZZZZZZZZZZZZZZZZZZZZZZZOO8DNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"ZZ.ZZZZZZZZZZZZZ,.....$ZZZZZZZZZZZZZZZZZ.... ...ZZZZZZZZZZZZZZZZZZZZZZZZODMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"NZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ. .  . .=ZZZZZZ=..,ZZZZZZZZ+$ZZZZZZZZZMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ?,... ..  ZZZZZZ.. ..7ZZZZZ,.~=. ..=ZZZZZZZNMMMMMMMMMMMMMMMM\r\n" + 
				"MMMOZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ..=ZZ..... .,ZZZZZZ..   .ZZZZZZ$Z7...  7ZZZZZZZZZMMMMMMMMMMMMMM\r\n" + 
				"MMMMMM8ZZZZZZZZZZZZZZZZZ7ZZZZZZZZZZ: ...ZZZZ....ZZZZZZZZ?. ..IZZZZZZ........~ZZZZZZZZZZZ8MMMMMMMMMMM\r\n" + 
				"MMMMMMMMMNZZZZZZZZZZZZZ,ZZZZZZZZZZ......ZZZZZZZZZZZZZ$......ZZZZZZZZZ7......ZZZZZZZZ7.ZZZZDMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMZZZZZZZZZZZZZZZZZZZZZ.....=ZZZZZ$?ZZZZZZZZZZZZZZZZZZZZZZZZZ....$ZZZZZZZZ,..,ZZZZMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMDZZZZZZZZZZZZZZZZZ.$ZZZZZZZZZ....ZZZZZZZZZZZZZZ....=ZZZZZZZZZZZZZZZZZ.....ZZZZZNMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMM8ZZZZZZZZZZ=ZZZZZZZZZZ~.....ZZZZZZZZZZZ$ ...?$ZZZ$ZZZZZZZZZZZZZ.....ZZZZZZOMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMOZZZZZZZZZZ:...=ZZZZ+...,ZZZZZZZ:...+7ZZZZ7ZZZZZZZZZZZ$......ZZZZZZZ8MMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZ....,ZZZZZZZ....ZZZZZZZ.. ..IZZZZZZZZZ$...ZZZ+...+ZZZZZZZZZNMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZ~...ZZZZZZZZ,...ZZZZZZZZZ....ZZZZZZZZZZ....ZZZ$ZZZZZZZZZZZZZMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZ7.OZZZZZZZZ..7ZZZZZZZZZZZZZ.,ZZZZZZZ?:....ZZZZZZZZZZZZ,$Z$ZZMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZ.ZZZZZZZ~.7ZZZZZZZZZZZZZ.....,..Z.......ZZZZZZZZZZZ.Z.$?ZZMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZ....7ZZ?....ZZZZZZZZZZZZZ:.......ZZ,...IZZZZZZZZZZZ..=...ZZZM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZ. ..........ZZZZZZZZZZZZZZ:.....ZZZZZZZZZZZZZZZZZZ$..,...$ZZM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZI?ZZZZZ?,=ZZZZZZZZZZZZZZZZZ7Z$ZZZZZZZZZZZZZZZZZZZ........ZZM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZI$ZZZZ.......IZZ8\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ7ZZZZZZI...,ZZZZZ\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMM8ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ7....ZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMZZZ...ZZZZZZ+.ZZZZZZZZZZZZZZZZZMMOZZZZZZZZZZZZZZ.......$ZZZZZZZZZZZZZZZZZZZZZD\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMZZZ+...ZZZZZ~.:ZZZZ7ZZZZZZZZDMMZZZZZZZZZ$. ....ZZ........ZZZZZZZZZZZZZZZZZZZZZM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMZZZI.IZZZZZZZZZZZZ?,ZZZZOMMZZZZZZZZZZZZ.......,Z..ZZ....ZZZZZZZZZZ..ZZZZZZZZZM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMOZZOMMMMMMMDZZZZZZZOMMMZZZZZZZZZZZZZZ......:ZZZZZZI..$ZZZZZZZZ~,...ZZ~.ZZZ8M\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZ+?IZZZZZ~...ZZZZZZZZZZZI....ZZZZZZ.....,..ZZZMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZZ?ZZZZZZZZ$..?ZZZZZZZZZZ......:ZZZZZ......:ZZDMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZZZZZZZZZZZZZZ$ZZZZZZZZZZZZZZ....$ZZZZZ7.,ZZZZZMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNZZZZZZZZZZZZZZZZZZ?...ZZZZZZZZZZZ,......ZZZZZZZZZZZZZMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZ...~ZZZZZZZZZZZZ....ZZZZZZZZZZZI... ~ZZZZZZZZZZZZZMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZ ....=. ..IZZZZZ.......ZZZZZZ..IZZZZZZZZZZ=ZZZZZZMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZ.=ZZZZ,....ZZZZZ.......I7Z+Z+...ZZZZZZ.7=.$ZZZZOMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZZ$..~ZZZZZZI....ZZI.......?ZZZ:...=+.ZZZZMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZZZZZZZZZZZZZZZZZZZ.......ZZZZ.......$ZZMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNZZZZZZZ+.,ZZZZZZZZZZZZZZZ....,ZZZZZ.......ZZ8MMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOZZZZ$...OZZZZZZZZZZZZZZZZZZZZZZZZZ.....:ZZMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNZZZ....ZZZZZZZZZ$ZZZZZZZZZZZZZZZZZ$ZZZZZZMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8ZZZZZZZONMMMMOZZZZZZZZZZZZZZZZZZZZZZZZZZ...ZZZZZZZZZZZZDMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZ+...ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ....?ZZZZZZZZZZZZMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZ...:ZZZZ.,ZZZZZ$ZZZZZZZZZZZZZZZZZ=.ZZZZZ?....ZZZZZZZZZZZZZMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOZZZ?.+ZZZZZ.$ZZZZ:$ZZZZZZZZZZZ..ZZZZ=.,ZZZZZ$...$ZZZZZZZZZZZZMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ..=ZMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNZZZZZZ$....ZMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNZZZ....ZZNMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZ?.,ZZZNMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZZZMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZ~.IZZZZMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZ....ZZNMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNZZZZZZZZZZZMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOZZZZ:ZZZZZZZZZMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDZ$ZZZZZZZ.ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ:..ZZZZZZMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOZZZZZZZZZZZZIZZZZZZ,IZZZZZZ..ZZZZZZ..:$ZZZZ7ZZZOMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZZZZZZ8MMMMMMMMMMM8ZZZZZZZZZZZ+ZZZZZZZ7ZZZZZZOMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMOZZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZZ8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMNZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMZZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMZ8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMM8NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" +
				"You are a Rat! Those born under the Chinese Zodiac sign of the Rat are quick-witted, clever, \r\n" +
				"charming, sharp and funny. They have excellent taste, are a good friend and are generous and loyal \r\n" +
				"to others considered part of its pack. Motivated by money, can be greedy, is ever curious, seeks \r\n" +
				"knowledge and welcomes challenges. Compatible with Dragon or Monkey.");
		break;
	case 5:
		System.out.println("....................................................................................................\r\n" + 
				"..............................................O.....................................................\r\n" + 
				".....................,.......................7O,....................................................\r\n" + 
				"...................OZ........................ZZZ....................................................\r\n" + 
				".................,:I:.......................ZZZO....................................................\r\n" + 
				"......,..........OOO,.......................OZZZ....................................................\r\n" + 
				"....OZZZ$... ....$ZZ.......................O?.:7....................................................\r\n" + 
				"....OZZ$OZZZZ,...O$Z,....................:ZZOOZ.....................................................\r\n" + 
				"...8Z..,ZZZZZZZZOOZOZ.................ZZIZO:,8,.....................................................\r\n" + 
				"..OZZ..OZZZZZZZZZZZZZZ$Z$O......$ZOZ~OZZ..++$..,....................................................\r\n" + 
				"..7ZZZOZZZZZZZZZZZZOZZZZZZZZOOOOZZOO8,:OZZO.........................................................\r\n" + 
				"....$ZZZZZZZZZZZZZOO..,...OZZZZZZZZZZZO$............................................................\r\n" + 
				"..ZZZZOZZZZZZZZZZZZZZ,..Z,..OZZZZZZZZOZ,.,+$OZZZZOZ$..,.............................................\r\n" + 
				"...,ZZZZZZZZZZZZZZZZZZO...,..OZZZZOZOZ.OZZZZZZZZZZZZZOZ=............................................\r\n" + 
				".....ZZZZZZZZZZZZZZZZZZZOZZOZOZZZZ..OZ..~ZZZZZZZZZZZZZZOZO,.........................................\r\n" + 
				"......IZZZZZZZZZZZZZZZZZZZZZZZZZZZZ,.....ZZZZOZZZZZZZZZZZZZZ$....... ..OZZZZZZZZZZZZZZZ,............\r\n" + 
				"........OZZZZZZ.ZZZZZZZZZZZZZZZZZZZZ7.. .,ZZZZZZZZZZZZZZZZZZZZZZI...OZZZZZZZZZZZZZZZZZZZZO,.........\r\n" + 
				"........,ZZZZZOOO,OZZZZZZZZZZZZZZZ,ZZOZ7...ZZZZZZZZZZZZZZZZZZZZZZZZZZOZZZZZZZZZZZZZZZZOOZZZZ........\r\n" + 
				"..........ZZZZZZOZ,~ZZOZZZZZZZZZOI.ZZZZZZOZZZZZZZZZZZZZZZZ8$ZZZZZZZZZZZZZZZZZZZZZOO=ZZZOZZZZO.......\r\n" + 
				"..........$ZZOZZZZOZ.ZZZZZZZZZZZZ..ZZZZ?ZZZZZZZZZZZZZZZZZ,+ZZZZZZZZZZZZZZZZZZZZZZZZOZ~?ZZZZZZO......\r\n" + 
				"...........OZO$ZZZZZZ,.Z?ZZOZZZZ..OZZZZZOZZZZZZZZZZZZZZZZ.OOZZZZZZZO..ZZZZZZZZZZZZZZZZZ.~ZOZZZ~.....\r\n" + 
				"............ZZ:ZZZZZZZ?.OO......,ZZZZZZZZZZZZZZZZZZOOZZZZ..ZZZZZZ$,.$ZOZZZZZZZZZZZZZZZOZ..ZZZZZ,....\r\n" + 
				"............ZOZ.ZZZZZZZZ.ZOZZZZZZZZZZZ=,ZZZZZZZZZZ=.OZOZZZ,.OZZOZ..OOZZZZZZZZZZZZOZZZZZZZ.~OZZZZ....\r\n" + 
				"............~ZZZ.ZZZZZOOZ.?ZZOZZZZZZOZI,ZZZZZZZZZOO..OOZOOZ..ZOZO..ZZZZZZZZZZZZZZZ~ZOZZZZ$.ZZZZZ....\r\n" + 
				".............ZZZ+~OZO$ZZZZOOOZZZZZZOZZZZZZZZZZZZZZZO$.....8Z7+ZOO.ZZZZ~.,$ZOZZZZZZO.ZZZZZZ.+ZZZZO...\r\n" + 
				".............+ZZZ.ZOZZ.$OZOOZZZOZZZZO$Z=OZZZZZOOZZZZZZZZZZ.Z~Z7.,ZOO...ZZO,$ZZZZZZO.$ZZZZZ.:ZZZZO...\r\n" + 
				"..............ZZZ77Z+OO+.$ZZZ:+$ZZZZZZ..OZZZZZZ?ZZZZZOO,,ZZZ:,$Z7O=..OZZZZOOOZZZZZZ,,ZZZZZ.=ZZZZZ...\r\n" + 
				"..............OZZZ.ZZ~OZZZ~.,ZZOZZZZZZZOOZZZZZOZ,,7=...~ZZ~Z?.OZOOZZOZZZZZZZZZZZZZO.,ZZZZZ.ZZZZZZ...\r\n" + 
				"...............ZZZ,~Z8:ZZZOZZZZZZZZ?ZZZZ$7ZZZZZO$Z?:7OZZ8..,ZOZO.ZZ:..$OZZZZZZZZZZZ.ZZZZZ$.ZZZZZO...\r\n" + 
				"...............OOZO.OOZ.,OZOOZZ8$ZZ~ZZZO.,ZZZZZZZZZZZZZ~.O$Z:8.ZZO.....,.$ZZZZZZZZ..OZZZZ.7ZZZZZ....\r\n" + 
				"................ZZZ,,ZZZ+.......ZZZ.ZZZOZZZOZZZZZZZZZZO..ZO.OZI,?OZZZZZO=.ZZZZZZO+.$ZZZOZ.ZZZZZZ....\r\n" + 
				"................$OZZ.7OZZZZZ$OZZZZZ.ZZOZZZZ,OZZZZZZZZO .ZZZ..OZZ..,Z$ZZZZ:ZZZZZZO.,ZZZZZ.7ZZZZZ,....\r\n" + 
				"................,ZZZ..ZZZZZZZZZZZZO~OZOZZOZZZZZZZZ,,.,ZOZZO=.7ZZZ$..OZZZZZZZZZZZ..ZZZZZ::ZZZZZO.....\r\n" + 
				".................OZZZ..OZZZZZZZZZ:ZZ,OZZOZ~OZZ,ZZZOZZZZZOZZZ.ZOZZOZ.ZZOZZZZZZZZ?.OZZZZ+.ZZZZZZ......\r\n" + 
				"..................ZZZO...8ZOZZZ=.OOO.OZ?ZOO.OZZZZOOZZZZZZOZ,,ZZZZOZ.ZZZZZZZZZZO.ZZZZZO.ZZZZZZ$......\r\n" + 
				"..................IZZO$:........ZOZO.7ZZOZZI.OZZO$OZOZZZZO.~Z$ZZZZ~ZOZZZZZZZZZ..OZZZ7.OZZZZZZ.......\r\n" + 
				"...................ZOZZZZZZZZOZOOZZZ,.ZO,ZZZ..ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZOZ.=ZZZO7.ZZZZZO$........\r\n" + 
				"....................ZZZZOZZZOZZZZOOZO.OO..OZZ,..ZZZZZZZZZZZZZZZZZZZZZZZZZZOO.~ZZZO,ZOZZZOZ..........\r\n" + 
				"....................ZZZZZ:.OZZOZ,.OZO.?ZZ.+ZZZZ,....ZZZ=8ZZZZZZZZZZZZZZZZZ,.ZOZZZ$OZZZZZO...........\r\n" + 
				".....................ZOZZZOO....:ZZZZ=.ZO?.~OZZZZZZZZZ...7ZZZZZZZZZZZZZZ,,Z$ZZZZZZZZZZZZO...........\r\n" + 
				"......................ZZZZZZZZZOOZOZZZ.$OZ..,$ZZZZZZO....?ZZZZZZZZZOZO,.ZZZZZZZZZZZZ$:ZO:...........\r\n" + 
				".......................7ZZZZZZ,...$ZZZ..ZZO?.,.OZOOZZ....ZZZZZZZZZ7..ZZZOZZZZZZZZOZZ..ZO............\r\n" + 
				"........................,ZZZZZZO..OZZZZ..ZOZZ~...,OZZ~..ZZZZZZZZZZZOZZZZZZZZZZZZZZZ...ZZ............\r\n" + 
				".........................7OZZZZZOOOZZZZZ..7ZZZZZZZZZZZ.ZZZZZZZZZZZZZZZZZZZZZZZZZZZ,...ZO............\r\n" + 
				".........................IZZZZZZZOZZZZZZZZ...+OZZZOZO.ZZZZZZZZZZZZZO.....OZZZZZZZZ....~Z............\r\n" + 
				".........................ZZZZZZZZZZZZZZZZZOZZZZZZZZO..OOZ?.OZZZZZZ........ZZZZZOZ......=I...........\r\n" + 
				".........................ZZZZZZZZ$8:,OZZZZZZZZO=,Z$....Z...ZZZZZOZ........OZZZZZ....................\r\n" + 
				".........................ZZZZZZZZ......,$ZZ+....7Z.....OO..?ZZZZZZ........~ZZZOZ....................\r\n" + 
				".........................ZZZZZZO................ZO. ..,Z..+ZZZZZOO.........ZZZZZ=...................\r\n" + 
				".........................ZOZZZZ.................:Z....ZZ.ZOZZZOZ~..........ZZZZOZ...................\r\n" + 
				"........................$ZZZOZI..................OOZZZO$ZZZZZZ,............ZZZZZZ,..................\r\n" + 
				".......................,ZZZZZZ..................IZZZZZZZZOZZ...............ZZZZZZ...................\r\n" + 
				"......................~ZZZZZZ$..................OZZZZZZZZZ................IOZZZO....................\r\n" + 
				".....................ZZZZZZZ:...................ZZZZZZO=..................OOZZZZ....................\r\n" + 
				"...................Z?..,,.Z?.................~$ZOZZZZZ...................+ZZZOOI....................\r\n" + 
				"................,?O.......Z................,Z..ZZZZOOZ..................$......~....................\r\n" + 
				"................O..8.....,O................=+$Z......I.................Z..,....7....................\r\n" + 
				"................=?....,:,....................:O.......8................O..OO...O....................\r\n" + 
				".............................................$$OO,.,O$I.................:...........................\r\n" + 
				"....................................................................................................\r\n" + 
				"....................................................................................................\r\n" +
				"You are an Ox! Another of the powerful Chinese Zodiac signs, the Ox is steadfast, solid, a \r\n" +
				"goal-oriented leader, detail-oriented, hard-working, stubborn, serious and introverted but can feel\r\n " +
				"lonely and insecure. Takes comfort in friends and family and is a reliable, protective and strong \r\n" +
				"companion. Compatible with Snake or Rooster.");
		break;
	case 6:
		System.out.println("         .   .......,ZZZZOZ?,.?....                                                              \r\n" + 
				"            ......ZZ.~7.:7ZZ$ZZZ=?I..                                                               \r\n" + 
				"         ...,.ZZ7.~$ZZZ+Z7=+,.$,+,....                                                              \r\n" + 
				"          .+ZZ.,ZZZ,,I.Z?ZZZZ7Z,ZZ+...                                                              \r\n" + 
				"       ...?Z=ZZ+.=7.=?ZZZZ.ZIZ$+.....                                                               \r\n" + 
				"       ..7?Z...:ZZZ$ZZZZZ77Z,Z..... .                                                               \r\n" + 
				"   . ..=ZZZZZZ,:ZIZ+Z+Z?7IZZ7......                                                                 \r\n" + 
				"   ..ZZZ$Z,ZZZZ~.:ZZZZZ:Z$Z,:ZZZ..                                                                  \r\n" + 
				"   .,+ZZZZ+.Z+$ZZ..,ZZZ,Z7Z$Z=7Z$..                                                                 \r\n" + 
				"   7Z?+,+ZZ=7Z.IZ+.+,+ZZ$?ZZZZ..+7.                                                                 \r\n" + 
				"   ,$....$Z=,Z.IZZ7~..Z$ZZ.~ZZ...Z                                                                  \r\n" + 
				"   ..7ZZZZZ7....7ZZ.ZZ.$ZZ77=~++ZI.                                                                 \r\n" + 
				"   ..I=Z,$ZZ.~....$+Z..+ZZZZZZZZ$..                                                                 \r\n" + 
				"   ..ZZ.?.$7ZZ=:,....~7ZZZ,Z:......                                                                 \r\n" + 
				"   .7Z7Z+7.+?ZZZZ$77ZZZZZ,.ZZI..                                                                    \r\n" + 
				"   .7Z:.ZZ...:I$ZZZZZZ?~+?Z,.$Z.                                                                    \r\n" + 
				"   .:ZZZ.,Z.. ..~?~Z=.Z$+ZI...ZZ,. . .                                                              \r\n" + 
				"   ..Z:ZZ7Z7.....,Z+.$.+Z$Z.. 7ZZZ....                                                              \r\n" + 
				"   ..~Z..ZZZ.$...ZZ...,ZZ:Z...IZ$~ZZ$,...                                                           \r\n" + 
				"   ...ZZ...ZII+.~Z....O$Z~I...Z+ZZ.Z~?$..                                                           \r\n" + 
				"   ..++ZZZ..~ZZ?~$..IZ..=Z. ..Z.~Z..~ I$$$.. .   ..                                   .... .. .     \r\n" + 
				"   ..Z.$ZIZI..ZZZZO$Z,.+$.. .Z,.,Z .= .?$.OZ$~..                                     .?ZZZO+...     \r\n" + 
				"   . Z..Z.ZZZ.$7.Z7+~.$Z. ..ZI..Z..,:...ZZ.Z..$$Z$$Z7I+=,......                    .+$~.ZZZZ7~..    \r\n" + 
				"   . ::.=Z.Z.Z.Z7,.Z..Z:..:Z.=.7...I....Z.~7:.I$:.$7,Z.Z?Z$7....                   .ZZZZZZZZZ7.     \r\n" + 
				"    ..Z...Z?Z=Z,$Z:Z.=Z..Z, .ZZ...7$ZZ.,I.$.$ ,$..$=.$.Z.=$$$+.....                :Z=??Z,..7...    \r\n" + 
				"   . .,Z.~.IZ$ZZ7???.Z..Z$...Z?$Z?. Z..+?,I.$.:ZZZZZ$.$7.Z.$$$$.  .                .Z+7=$: .....    \r\n" + 
				"     ..:Z+Z?.~Z,.ZZ=I$?ZZ..+Z+.    :Z..Z?.?~ZZ$$...$Z$,,$?:Z$$$$=..  .             .ZI,.Z=..        \r\n" + 
				"      ..ZZZZZ,.IZ~Z,Z.7.Z.Z7....   =I.~$$.$Z...,ZZZZ$.$$.=ZZ$.$$Z$....             .ZZZZZ?          \r\n" + 
				"      ..Z.$ZZ=ZZ=.ZIZ+.,ZZ..    ...$:.Z.$7$...Z?.,IZZ$.?:....$7$ZZZ....            .$Z.:~7..        \r\n" + 
				"      ..Z..==Z$..,ZZ.Z,.Z~.     ..$$~Z...$$ZZZZ$$$$ZZ7..  ..Z+$,Z+ZZ..             .:ZZ7ZZI.        \r\n" + 
				"      ..~Z.+Z=.$ZZZZZZZ:Z.,....~$$$$I...,$$~..,: .....I$$$ZZZ$:.Z.ZZZ....          .:Z=..Z:.        \r\n" + 
				"      ....Z..IZZZZ+,.7ZZZZ?:.7Z7. . . ..Z$,$$I..?$=7?,7$:......$+$+.ZZ.            .IZI?ZZ+.        \r\n" + 
				"          .+ZZ?~IZZZZZZZZZZ.Z~.....7   .ZI$= ...$?....:+$Z..=?I,Z:..ZZ...        . .ZZZZ.Z+.        \r\n" + 
				"          ...Z+I+......?ZZZZ.... ,$.....ZZ..ZZZZZZZ7... . I$$$Z:,..?ZIZ.        ...=Z:..ZZ$.        \r\n" + 
				"            .~Z.. ...+ZZZZZ?.=ZZ+..   ..$$ZZZ$. .  .~I$$7...$Z.,,IZ=.ZZI....  . ..ZZZZZZZ=..        \r\n" + 
				"            ..OZ. . ..IZZ$ZZZ,7?...   ..$$$$ .$$=. .. ...=ZZ..7Z?.=?ZZZZ++II7?=:7ZZ=..ZZ+...        \r\n" + 
				"            ...$?. .......ZZ:Z=..     ..$$$ $$..      . ..     ...~,.+$I?7ZZZZZIZ$.ZZ+7=.. .        \r\n" + 
				"            . ..$Z~. . ...IZ7...      .~ZII.$..       ....=I.. .  ..ZIZ.Z.Z+$ZZZ.+IZZ$...           \r\n" + 
				"            .. ..$ZI......=Z.  .      .?Z~Z?$. .      ..?ZI. .. ...?ZZ$.+.Z?Z7ZZ.ZZ?=:.             \r\n" + 
				"                 .Z~ZZZZZZ?$.      ...?Z.IZZZZ~...,. .~ZO,.. ..... ~ZZZZZZZZZZZZ$=.....             \r\n" + 
				"                 .:ZZ$....Z$.       .,$,ZZZZ..ZZZ,,IZZZ,... .,+ZZ$Z7..~............ . ..            \r\n" + 
				"                ...I+......$..    ...$Z+I.=Z$:,.IZ$~..==ZZ,,......$:..                              \r\n" + 
				"                  ..ZZZZ...Z.     . ZZZO+I.$$Z............ ...~?Z7....                              \r\n" + 
				"                   .Z~.. ..Z....   .Z7..$:Z..Z........IZZZ$I~. .. .                                 \r\n" + 
				"                   .?Z... .$7Z.. ...Z7...7?+Z.?.....Z,... . ..  ... ..                              \r\n" + 
				"                   ..Z.....7...     =Z....:ZZZ+~7Z?. .                                              \r\n" + 
				"                   .$=.....Z,...  ...Z..... .... . ...                                              \r\n" + 
				"                ....~,?.I7.Z,.....Z..=...                                                           \r\n" + 
				"                ..Z$ZZZZ$~Z$.I$+,ZZZZZ...                                                           \r\n" + 
				"                .7,.Z?.Z..Z+ZZZ$7Z..=Z...                                                           \r\n" + 
				"                .ZZ.Z.I$Z~$Z.,,.,ZZ,.7...                                                           \r\n" + 
				"                ..I?,ZZ7+.Z7Z.~I.,$ZZ~...                                                           \r\n" + 
				"                .. .....,ZZ$ZZZ7ZZ... ...                                                           \r\n" + 
				"You are a Tiger! Those born under the Chinese Zodiac sign of the Tiger are authoritative, \r\n" +
				"self-possessed, have strong leadership qualities, are charming, ambitious, courageous, warm-hearted,\r\n " +
				"highly seductive, moody, intense, and they’re ready to pounce at any time. Compatible with Horse or Dog.\r\n");
		break;
	case 7:
		System.out.println(".              ..  .  .  .                                                                         \r\n" + 
				"  .. ..        .. ... ...... .               .        .               .        .               .    \r\n" + 
				"  . ....      ..........=$$$..               .            . .. .. .. .. ...... .. .. .. .. .. .. ...\r\n" + 
				"  ......       .. .. ..,$~.ZZ...                                      .        .               .    \r\n" + 
				"  . ....    .  ........ZZ...Z?.. ..  .  .. . .. .  . .. ... .. .. ..  .  .  .  .  .. .. .. ..  .  . \r\n" + 
				"  . ..         .. . ..,$7 ..:$,.                                               .                    \r\n" + 
				"  .  .         .. . ..ZZ...:.$Z. .       .   .  .  .  .                        .                    \r\n" + 
				"    .  .       .. ...~$I.,.7.IZ...           .  .  . .........        .  .  .  .               .  . \r\n" + 
				"  . .              ..$O..=.?..$7..   .           ....,O$Z?7Z..                                      \r\n" + 
				"  ............     .7Z.=.7:~..OZ..   .   .  .  . .,ZZO~...7Z..                                      \r\n" + 
				" .. .  .         ..OZ,.+,ZZ..:I$..   .   .  ...=ZZ:..=..  $$.                                       \r\n" + 
				"  ............  ..$$=.O:Z$Z,Z.+$,.   .   ....IZ~... =.....ZI..                                      \r\n" + 
				"...... ....... ..O$,.,ZZ$$$$:.+$,.   ....,Z?. ...:.7....I:$.                                        \r\n" + 
				"  . .......... .~Z~:,Z$ZIZ$O.:IZ..   ..IZ,...:=~Z.??..I..Z$.                                        \r\n" + 
				"... .. . ......:$,I.Z$O..:$ZZ.OZ...,Z$..:.O.O=Z?Z,Z,Z~..I$:.                                        \r\n" + 
				"  .............Z7.,OIZ.. .Z$~Z$I.?Z7...:?=OZ$$$$$Z$$....ZZ..                                        \r\n" + 
				"... .. . .....Z$.=,Z$.    ,$O+$OZ:...O=$$$$ZI~,$$$ZZ$..ZO.                                          \r\n" + 
				"  . ..........ZO..$$:......ZZZ$8.:.7I$$O=.. ..?$Z$+...7Z..                                          \r\n" + 
				"  .. . ......,$?:OZO..,Z...Z$Z..=$Z$Z:....   .$Z+7I..=Z...                                          \r\n" + 
				"       .   ..~$=.Z$:..Z$Z..ZZ,.~$$Z:...... ..~$$?...+Z,...                                          \r\n" + 
				"  .    .   . :$+Z$$..O$$$~$O.,$Z$?...~Z$O. .:$$O=.,$Z.                                              \r\n" + 
				"       .     ,ZI,ZZ..$$$$$$..IZ$O..=Z$$$:..,$$,..:$I.. ...    ....                                  \r\n" + 
				"  .    .     .ZOI$Z.,$$$$Z..?$$=.?$$$$$$..?$Z..~ZO......   ...,,,..... ... .                        \r\n" + 
				"       .     .Z$?$$:,$$$$:..O$Z.7$$$$$Z..:Z=,:$Z~.....~$Z$$$$$$$$$$$$$Z7:...........................\r\n" + 
				"  . .. .     .~$=~$O,$$$$..Z$Z.Z$$$$$$..Z$..Z$,...Z$$$$$$$$$$$$$$$$$$$$$$$$Z=...                    \r\n" + 
				"       .     ..Z7.$$:$$$Z.I,Z+Z$$$$$$?:O$~IZ$..~O$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Z...                  \r\n" + 
				"  . .. .       ~$..Z$$$$$..=$$$$$$$$,ZO~~Z,.IZ$$$$?.$$$$$$$$$$$$$$$$$$$$$$$$$$$$O...                \r\n" + 
				"       .     . .Z=.+$$$$$ZZZ$$$$$$$=$$?ZZ?Z$$$$$I..II,$$$$$$$$$$$$$$$$$$$$$$$$$$$$,.                \r\n" + 
				"  .... .......  7$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$O...O=O$$$$$$$$$$$$$$$$$$$$$$$$$$$=..              \r\n" + 
				"       .     ..:Z$$$$$$$$$$$$$$$$$$$$$$$$$$$$Z$$$$?...ZZZ$$$$$$$$$$$$$$$$$$$$$$$$$$$..              \r\n" + 
				"  .  . .......Z$$$$$$$$$$$$$$$$$$$$$$$$$$$...Z$$$$$= .:7=Z$$$$$$$$$.~$$$$O..$$$$$$$$$...      ....  \r\n" + 
				"  .    .  ...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.,::~$$$$Z...O=I$$$$$$$$7...O$$....=$$$$$$ZZ..   ...ZZZ...\r\n" + 
				"  .  . .....Z$$$$$$$$$$$Z$$$$$$$$$$$$$$$$$Z.:ZZ$$$$$O..ZZZ$$$$$$$$$.. :$..   .:$$=...$Z.   .Z$$$$$..\r\n" + 
				"       .  .$$$$$$$7$=Z+.IZOI$$$$$$$$$$$$$$$...OZ$$$$$...+Z$$$$$$$$$$,.:~.......Z=.  O$$:...$$$$$$$I.\r\n" + 
				"  .. . ...Z$$$$$$.,.+$7~....~$$$$$$$$$$$$$$=.:OZ$$$$$?. ..I$$Z.......?Z+..7==..Z..,$$$$$$+~+$$$$$$$.\r\n" + 
				"       ..Z$$$$$$~:Z~...,Z=.=O$$$$$$$$$$$$$$?..:ZZ$$$$Z..7Z$$$$..  .....O.OI7??:$ZZ7?OZ$$$~~.$$$$$$?.\r\n" + 
				"  . .. .?$$$$$$$$..$ZZZ..,Z.=Z$$$$$$$$$$$$$?..IZZ$$$$O...~Z$$$I.  .?.7=:Z$$$$ZO........,$Z..O7$$$O..\r\n" + 
				"       .Z$$$$$$Z.$$$$$$$Z.Z$$$$$$$$$$$$$$$$=....=$$$$Z...~Z$$$$~...=~Z$$$$Z$$$Z=:=.....,$$I.7=$$Z,..\r\n" + 
				"  . ...+$$$$$$$O7$+=Z$$$$.~$$$$$$$$$$$$$$$$.....:$$$$?.$Z$$$$$$$Z~..?Z$$=...Z$$$:... ..$$$$..7?$..  \r\n" + 
				"     ..Z$$$$$$$$$,...Z$$$.$Z$$$$$$$$$$$$$$$...$Z$$$$$,.$77$$O,...~ZZZO$$?...Z$$Z=....?$$$$$~.IZ.    \r\n" + 
				"  . ..,$$$$$$$$$$~..,$$$7?$$$$$$$$$$$$$$$$....O$$$$$Z.+OZ$$,.....OI.,7$$$$$$$$I$OOOZ$$$$$$$$O...    \r\n" + 
				"      =$$$$$$$$$$$ZZ$$$~I$$$$$$$$$$$$$$$$7...:O$$$$Z...,Z$$$ZZZ$$+..:,Z$Z$$$$ZZ.+O....7$$$$$..      \r\n" + 
				"  . ..?$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$+..=$$$$$$$$$$$$$$$$$$$$$. .?.~?.$=IIZ=...Z,....$$$7..      \r\n" + 
				"     .~$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Z:...Z7+$$$$$$$$$$$$$$$$$$.. . ...Z$7...I. .=$ZI=?$$$~        \r\n" + 
				"  .....Z7...=$$$$$$$$$$$$$$$$$$$$$$$$$I~,,ZO$$$$$$$$$$$$$$$$$$$$......,Z,,Z... . .:$$$$$$$O.        \r\n" + 
				"      .~$...$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$=::~$O$:..$Z..   .=$$$$$$Z..        \r\n" + 
				"  . .. ..I$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  .?$$$Z:..O$$$$$Z...        \r\n" + 
				"     .    ..7Z$$$$$$$$$$$$$$$$$$Z$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$...Z$$$$$$$$$$$$Z..          \r\n" + 
				"  . .. . .  . ..,$$$Z$Z$$ZOZ+..7$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Z?$$$$$$$$$$$$$O.            \r\n" + 
				"         .....=$Z$$$$ZZ7I??IZZ$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Z..            \r\n" + 
				"  ........,Z$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$....            \r\n" + 
				"       ..+$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Z$O=....,?OOOZZ$$Z$$$$Z$ZZZZ$$$$$$$$$$$$$+..              \r\n" + 
				"  . .. ...O$$$$$$$$$$$$$$Z?$$$$$$$$$$$$$Z,.. ...IZ$$$$ZZOOZ$$$$$$ZOO.O$$$$$$$$$$$$$~..              \r\n" + 
				"           .=ZOOOOZZ7+,..I$$$$$$$$$$$$$:..   ..Z$$$$$$$$$$$$$$$$$ZO.=$$$$$$$$$$$$$$Z....            \r\n" + 
				"  . .. .    ......... ..Z$$$$$$$$$$$O.....   ..~$$$$$$$$$$$$$$$+?ZZ$$$$$$$$$$$$$$$$$$Z..            \r\n" + 
				"                     ..Z$$$$$$$$$$I...         ...=$ZOZ$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$I.            \r\n" + 
				"  . .. .             ..IZ$$$$Z7, .   .               ...Z$$$$$$$$$$$$$$$$$$$$$$$$$$$ZZ..            \r\n" + 
				"                       .......       .                .Z$$$$$$$$$$$$$ZZI=:::+7ZOOZ7:..              \r\n" + 
				"  . .. .                             .                 .$Z$$$ZZ=..                                \r\n" +
				"You are a Rabbit! Those born under the Chinese Zodiac sign of the Rabbit enjoy being surrounded\r\n" +
				" by family and friends. They’re popular, compassionate, sincere, and they like to avoid conflict \r\n" +
				"and are sometimes seen as pushovers. Rabbits enjoy home and entertaining at home. Compatible with Ram\r\n" +
				" or Boar.");
		break;
	case 8:
		System.out.println("                                      .... .O..                       ....                          \r\n" + 
				"                                      .O,.$ZI...                ....,,Z=,.,...+.,..::.              \r\n" + 
				"               ... .       ..   . ....7$$$$I..++             ...++..OI..IZ$$ZI...$O,..              \r\n" + 
				"             ..:Z$ZZ..   .,7Z=...7ZZ$ZZ$Z$.,.7$O            ..,O:.ZZ+.ZZ$:.:+I+IZ$..                \r\n" + 
				"              .7$$$$$.   .$$$$ZI$$$$7+..:$..$$$:           ..I$.:$+.~$Z..$$$$$ZI....                \r\n" + 
				"              .?OZZI......IZZZOZZZII,..+OZ$ZZZ=...     ... .$O.=ZI.IOO.=O$I......7..                \r\n" + 
				"    ...........O$$$,~$+:?$I.:=Z$$$$$O.$$$$$$$..,:..... ...++Z~,Z$$$$$$$$$.~Z$$Z$:...                \r\n" + 
				"   . ~?$$$ZZ$+=Z$ZZZ$ZZZZZZO?$ZZZZZZ$ZZZZ$I.ZZZ7++IZZ~..IZ.OZ7$ZZ$ZZZZZZZZZ~....                    \r\n" + 
				"   .. .......:ZZ+..$ZZZZZZZZZ.IZZZZZZZO:.$ZZ..:ZZZZ...$ZZ=ZZZZZ....ZZZZ$.,~IZZO....,                \r\n" + 
				"           ....~Z$:..:I$$$$$.:ZZ$$$$$$$$$?.:$$$$$$$$$.$$$$Z+$Z~.~+$$$$$$$$$7:+$$$I..                \r\n" + 
				"           .:$...IOZ$~:.OOI$$.=$ZZZ$$$Z7$ZOZZ.:+?:.O$Z$$Z$.,7Z$$$$Z$$...:...,.....                  \r\n" + 
				"         .=Z$O.....,$$Z$$Z.7$$=$$$$$$$$$$$+?$$Z$$$$$$$$$I=$$$$~...~$$$Z$$$$+..                      \r\n" + 
				"       ..IZZZZZZO~ZI,?,OZ7.ZZZZZZ$ZIZZZZZZ$.,....:.ZZZI$ZZZO..       ,::..,,                        \r\n" + 
				"        .$$$$$$$$$$$$$Z$$$$$$$$$$Z.7$$$$$$+?$$$$$$$$Z~$~I$Z...       ...                            \r\n" + 
				"        ..$ZZZ$$+7ZZZZ$Z$ZZZ$ZZZ=.~OZ$OZ$ZZ$:....OZZ$ZZZ$Z7.                                        \r\n" + 
				"          ...$$$$+.$$Z..+7$$$$$$Z$$$+:$$$$==$$$$.:Z$$Z~.Z$$.           ..  ........... .            \r\n" + 
				"             . .:OO.OZO=........O$:.:OZZZZZ.   .Z:,OO,$Z?OZ~....   ......:I$ZZZZZZ$Z?,...           \r\n" + 
				"                 ,.O7.:==+ZZ?..,OOIZZZZZZZZ$   ..$ZZZZZ?ZZZZZ$~...~IZZZZZZZZZ$ZZZZZZZZZZI,..        \r\n" + 
				"                 ...?Z$?+...+$I$$$?...ZZ~?,I.   ..$$$O.~$$$$$$$$$$$$$$$I??$Z..,$+.:O,~Z$$$~..       \r\n" + 
				"                   .........II$$$$O$$ZZ:O:...   ,..O$ZO$$ZZZZ$ZZO$$Z..=Z~...:.......:..:?+O$....    \r\n" + 
				"                         .~.Z$$Z,$$$Z~+ZZ...   ..~Z$$$Z$$$$,.?Z....=$. .....:?7$$$$?=~.....$I.$.    \r\n" + 
				"                      ..:Z$ZZIZZZIZ$.ZZ.O.       ..=ZZZ=..7$ ...  .....:$ZZZZZZZZZZZZZZZOI..OZO...  \r\n" + 
				"     .               ..7$$$Z$:+$$Z:~$$~...       ....+$$$?.........+$$$$$$$$$$$$$$$$$$$$$$$$$$Z.~.  \r\n" + 
				"   ...ZI....         .OZZZ~ZZZ$O$.O:$Z..            ...~$$ZZZZ$ZZZZZOZ$OI~....... ..IZZZZZZZZ$O~O...\r\n" + 
				"   .?$$$Z$$Z..     ..$$$$$+.Z$O.$$$.+...               .....::+==~:.....           ..:Z$$$$$$+O$$.  \r\n" + 
				" .....ZI.?O...     .$$Z~O$$$Z.Z$O,:.       .....=..O...=$=..=$?...I$..               .7Z.$?,OZ:$O...\r\n" + 
				".,.,..Z$.O+.. ....,7ZZZZ.=7Z7?O~O...   ,......ZO.:OO.~ZZZI$$ZO.IZZZ$. ,~:...         .7ZZZZZZO.O$::.\r\n" + 
				"..Z$..ZO?$:....+Z$$$$$$$$$7$$?Z.....   ..=O..Z$I~Z$$$?..~I$$$$$?:I$$$$$$Z:..         .ZZ~.I$$Z.Z$$..\r\n" + 
				"..OZ$I$$7$O+=ZZZ$$$$$$Z$Z$$ZO=Z$7O..:O..O$O.O$$$I:,?$$ZZ$$$$$O=ZZZO=ZZI?$Z$$I,.....,IZ$$O$:OZO=$O.. \r\n" + 
				" .OI.Z$$$$$$$$$$$$$$$$Z+.:Z$$$Z$Z:.$$++$$$Z$~.=Z$$$$$$$Z$$$$$$O.7$.$$?$.. .:Z$$$$$$$$$Z$$$Z+$IOZ~...\r\n" + 
				",,?...7ZZZZZZZZZZZZZZZZZZZZIZZZ$:Z$ZZZ7~..?ZZZZO:?ZZO,ZO.OZZZZO.$O.$ZZZO...$ZZZZZZZZO~:..ZZZO~ZZZ.  \r\n" + 
				"........Z$$$O.......:$$$$$~I$$$$$$~::+$$$$$$$.Z$$.$$$?$$?Z$?$$$$$:$$$~$$$:.....,$$$$$$$$?+$Z?$$I..  \r\n" + 
				"..     .=ZOZOZ7......OOZ$$7ZO~OZZZ$ZZZ7ZZO.ZZO:OO~8ZZZZZ$Z7~OOZZ$ZZZZZOZ$ZO:..=$O~...~ZZZZZZZZ..    \r\n" + 
				"       ......+Z$$. ...Z$$$$7.~Z$Z$O.$$$.$$=IZ$Z$$$$$$$$$$$$$$7~$$$..:I$$$$$$$+.... .Z$$$$$$Z~...    \r\n" + 
				"           ..$Z$Z:   ..O$$$$$$$.O$$$?$Z$$$$$$$$$Z:7$$$Z:.Z$$Z$$$:$II......,?Z$$$$$Z$$$$$$7$,. ..    \r\n" + 
				"              ....    ..ZZZZZZ$OO$ZZZZZZZZZZ$O,...ZZZZO~..=ZZZZZZO.OZ:.......=Z=$ZZ$ZO=.... ..      \r\n" + 
				"               ...   ....~$$$$$$.$$Z$$$$$$Z$?$$O...O$$$$?$$$$$$$$$$$$$Z..?$ZI.=ZO?..~~....          \r\n" + 
				"                        ...$$Z$$Z$7OO.,Z$.O+:O$Z7..O$$OO=..:O.=O$$$Z$$$ZZ7,.IO=...IZ=.              \r\n" + 
				"                          ...$Z$I:.O$$+.?$.?+..+$$Z$$$Z..,.... .....~$$$$Z$$:...$$:.                \r\n" + 
				"                         ......ZZZZZZZZZ:.~ZZZI~~7ZZZZZZZ?..        ..:ZZZZ+..+O=...                \r\n" + 
				"                         ..:....7$$$$$$Z$+.O~+7Z$$$$$Z~.,$Z. .....  ...O$$$$$7:.....                \r\n" + 
				"                         .?ZZ7...ZZZZZ......I$II8I:... .+$7.  IZ:...  .OZZ$Z. .                     \r\n" + 
				"                     . :OZO..ZZZZZZZZI:?ZZOIOZ,...     ...   .O:IZZZZZOZZZZ$ZZOZZZI.                \r\n" + 
				"                     ..,Z$$$$I?$$$$$$$$$~+Z$.+I...       . . +Z?+:$$$$$$$$$=....~O..                \r\n" + 
				"                       .7O.=$ZZZ$$ZZ$O .  O.  .              .ZZZZ$Z$Z$O....    $...                \r\n" + 
				"                       ..I....?Z$$$$:...  ..                 .,O.~$Z$$,...     .....                \r\n" + 
				"                       ...=ZO$$.....                         ..:OZ$:....       ..                   \r\n" + 
				"                          .?Z+..                               .:Z....                              \r\n" + 
				"                           ..?..                                 ...                                \r\n" + 
				"                           .....                                 ...      \r\n" +
				"You are a Dragon! A powerful sign, those born under the Chinese Zodiac sign of the Dragon are energetic\r\n" +
				" and warm-hearted, charismatic, lucky at love and egotistic. They’re natural born leaders, good at giving\r\n" +
				" orders and doing what’s necessary to remain on top. Compatible with Monkey and Rat.\r\n");
		break;
	case 9:
		System.out.println("                  .....O8O88?Z8..IOO8OZ.........                                                   \r\n" + 
				"                 ....=OO$.,.?..8,:7OOOOOO8~......                                                   \r\n" + 
				"                ...,OOOOOOO::+=~.:OOOOOOOO88,., .                                                   \r\n" + 
				"              ....+8OOOOOO?.O..7IOOOOOOOOOOO8~ ..                                                   \r\n" + 
				"            .....OI,:OOZOOOOOO88OOOOOZOZ+:.+8O?....                                                 \r\n" + 
				"            ...,8Z7,=.=OOOOOO8IZOOZOZ:..,88:IOO~....                                                \r\n" + 
				"            ...?Z..7?7O8ZOZO....=8ZOO7..O8~~~ZZO.....                                               \r\n" + 
				"            ..,OZ$7D..:OZ7=......$OO8OZ78?..OOOO~...,                                               \r\n" + 
				"            ..$Z.:,.8OO8O,........8OOOOO88ZZO8ZOZZ...                                               \r\n" + 
				"          ....O8?OZ~OZ8=Z...    ..,8OOOOOOOOOOOOOO8:...                                             \r\n" + 
				"          ...~OOOOOO8O8 Z...    ....Z8ZOOOOOOOOOO8OZ...                                             \r\n" + 
				"          ...+OOOOOOOOO.8,...    .....:?7ZOOOOOOZO$7....                                            \r\n" + 
				"          ...+OOOOO8OO8.,8...... ...........~O8OZ~87............                                    \r\n" + 
				"          ...~8.O:.=8OO~..8:....   .      .....I:..I8~..........          ..  ..........            \r\n" + 
				"          ....8~,=,7.:88...~7.........    .......,...IO8OI?II...           ......:::,...            \r\n" + 
				"          ....?Z7:I+I8OZ$....7O~.......   ............,8........           ...IOOOO8?=~.            \r\n" + 
				"           ...,?O=77..IZOO7.....~$87:,........       ...7......         ...,8OOO$.......            \r\n" + 
				"           ....,8O,,O8OOZOOO=..:....,+OI......       ...7....           ...O.D$O,,......            \r\n" + 
				"       .....ZO887O8+8OOOOOOOOOOO~... ...~O,.....     ..,.. .            ..+ZO,IO:.. .               \r\n" + 
				"   ......~DZZOZ+.=OOZOOOO+:$ZOO8OZ87......=Z....     ... ...            ..+O.$,:Z....               \r\n" + 
				"  ..,..=OOOOOO,.?7=$OOZ:?~.+.,7O8ZOOZOO+....$~.....                  ..  .=O.I,78Z....              \r\n" + 
				"......$O8ZOOOO=,?I..OZZ..=$O,O~~ZOOZOO8OO....=$.....                ... ...8$OOOOO8.....            \r\n" + 
				"....IZOOOOZOOO$..I.$.+8O8Z..Z=,=OOOOOOOOOOO.,.,O.....         .............,ZO8O8+,Z,....           \r\n" + 
				"...=ZOOOOOOOOZZ8O..7~I8ZOOOO=..?OOOOOOOOOOO8.,..I.  .       ....,..I$$7~....7OOZ=,$,O$.....         \r\n" + 
				"..,O8ZOOO?=$OO8OZ88OZO?...,ZO7=OOOOOOOOOOOOZ:...?,...       ....78OZ88OO8+...IIZO.=.,,8~....        \r\n" + 
				".,8OOZ.,$..7,:OOZOZ8..,+$:.....:O8OO~O7=ZOOO7....Z,..     ....:DOOZOOOOO~,8~..,8,I8IO8OO$.......    \r\n" + 
				".IOO8OO:,?+~..ZOOO8..~8..........?8I.I..88OOO....~+..   .....,O,=OOOOOO$7:$O... 8,.+OOOOOO7.....    \r\n" + 
				",8OO:.,.+..8:.:OO8..8,,............ZZ$$?..ZOO.....D..     ...ZO7,.+OOOO$?Z.~I....:8:,,$OZ8,,=...    \r\n" + 
				":OO888$:O~78:..OO8..I...        ....~.,D78OOO.....Z..     ...O~.=,?OOOO~.II:O,...,.?=..=8~=I7Z..    \r\n" + 
				":OOOO:..:.I..IOOO8+.?...    ........D$.$..O87.....8$..    ...7.7,88OI,~7Z:=7I7... ...I$.~O~.7~O.... \r\n" + 
				",OOOOOZ8..?$:ZOOO8O?D.,.............O$.,O8OO+....+O8....  ..=?,8~OD?O?..7OOOZO,..    ,,8.7?$:=,$... \r\n" + 
				".78OOOOOOOOO88Z8ZZOZO8I............IOO88OOOZ....,8ZO?.......OOOOOO7~,.7:.7OOOO8..... ...~:OZOOO8... \r\n" + 
				".=OOOOOOOO8OO+:O..?OOOOO+,......IOZZZOOOOOO8....7OZOZ+..,..$OOOOO?O....D.,OOZZO8........I=OOZOOO... \r\n" + 
				"..7OOOOOOOZO8=..,:+..ZZOO88O87:OI...8OOOOO8,....OO8..?87OOZOOOOO7==....:,.~OOOZ=O.......OO8IO8OO... \r\n" + 
				"...ZOOOOOOOZ..I8~$+:OOO87.,.Z...=,,,OOOOOO+....ZZOOI:?I.?:..8O8O.D......?..7OOI.+7O:..?8O+7:?..8... \r\n" + 
				"....$O8OOO8O+I7O.=O...ZOO7$$.I+7..,OOOZOO=....Z8OOO7,,I,.~$7OZ8=$~......8,,.O8..O+7,IOOO8Z=7~OO~... \r\n" + 
				"   ..?8OOOOO:..?:7..88OOZ8?..7..?,.8OOOO~....Z88OOO8$$..~.,8Z8=.$.......,O..,8OI.=.$:8ZO=.,O+8?...  \r\n" + 
				"   ....=OOOOZ?8:.+=.ZOOOOOZ8OZ,,8OZO887....=Z,,.OZOOOZOO8OOO?..8.....  . ,O=..=8OO788OOOZZ,,8,....  \r\n" + 
				"   .....,I8OOOOZ+OOOOOOOOOOOOOOOOOO8Z....~D~.O?..:OOOOOOOO8+..Z:..      ...=+...OZZOOOOOOO8Z,...    \r\n" + 
				"   .........=OO8OOOOOOOOOOOOOOZ8O$:..,~8~......~Z,....,,....?7....      .....,7O+:.~7O8O$,.. .      \r\n" + 
				"       ........,?OOOOOOOOOOOOI+,.:=7$+:..........~87,....,~O.,....      ..........~::,....... ..    \r\n" +
				"You are a Snake! Those born under the Chinese Zodiac sign of the Snake are seductive, gregarious, \r\n" +
				"introverted, generous, charming, good with money, analytical, insecure, jealous, slightly dangerous, \r\n" +
				"smart, they rely on gut feelings, are hard-working and intelligent. Compatible with Rooster or Ox.\r\n");
		break; 
	case 10:
		System.out.println("                                                                                                   \r\n" + 
				"                                                                        .   ..   ..                 \r\n" + 
				"                                                                   ............?.,.   .....         \r\n" + 
				"                                                                  ......~+7$I=ZZO............ .     \r\n" + 
				"                                                                ...~Z7........7.?ZO+..7ZZZ....      \r\n" + 
				"                                                            .   .7O......=$$=:~..Z..~OZZZO. .       \r\n" + 
				"                ..                                       .. ....O~.. ..Z$ZZZZZO$.Z...,OOO,...       \r\n" + 
				"             ......                                      .....~Z... ..~ZZZZZZZZZZZ,:.I.$+.....      \r\n" + 
				"              ...               ......                  ......O~.......:ZOZIZZZZZZZO.O7ZZO....      \r\n" + 
				"             ....               ......                .......7Z. . +.......7ZZZZZZZIZZ$ZZZZ..       \r\n" + 
				"             .. .               ......                .......Z.....::.....7$ZZZZZZO$ZZZZ=ZO7...     \r\n" + 
				"          ....                  .....               ..... ..OZ.. ...ZZOZO$ZZZZZZZZZZZZZZ.$ZZ. ..    \r\n" + 
				"         ...                      ..               ....   ..ZO...,.....~=ZZZZZZZ?ZOZZZ$Z~.OO....    \r\n" + 
				"                                                          ..O?. ..$Z....$ZZZZZO$.ZZ$ZZ$ZZOZZ. ..    \r\n" + 
				"                                                          ..ZI.....ZZZZOZOZZZZZ..,ZZZZZZZZ$O:...    \r\n" + 
				"                                                          ..OZ.. ....~OZ$?ZZZZZ....+ZZZZZZ$ZZ...    \r\n" + 
				"                                                         ...,Z..   ......7OZZZZI......ZZZZZZ~Z,.    \r\n" + 
				"                                                            .7I... ,ZOOZZZZZZZZZ..... .Z$ZZOZO..    \r\n" + 
				"                                                             .O$.:.....=ZOZ$ZZ$OO...  ..,...:..,    \r\n" + 
				"                                                             ..Z~.7........7ZZZ?ZZ. ..              \r\n" + 
				"                                                            ...?$~.8........ZZZZZZ~...              \r\n" + 
				"                                   ......                    ...ZO..ZO7.....OZZZ.$O...              \r\n" + 
				"             ...                   .....              ...... ..$ZZ...ZZZ....ZZZZ,OZ7...             \r\n" + 
				"           .......               .....   .      . . .........?ZZ....?ZZO:..~O7$$7Z7O..  ..... ..    \r\n" + 
				"           .......              ....     ...        ......:OZOZ$ZZZZOZZZ..$Z?=$$Z+ZO.. ......  .    \r\n" + 
				"             ...             ......   . ..............=$ZZZZZZZZ$Z7?+$7OO$ZZZZZZ,OZZ+?ZOZOZZOZ..    \r\n" + 
				"                         . .  ....  . ....+ZZZZZZZZZZOZ.~ZZZZZZZZZZ~ZOZZZZZZZZZOZ7:OOZZZZOZZZ$7.    \r\n" + 
				"                        ....,IOZOO$,...~OZZZZZZZZZZZZZI..ZOZ+=$ZZZO$ZZZZZZZZZZ7,.~$ZZZOZ:.,ZZZZ.    \r\n" + 
				"                      . ...O~..+?+.?Z,ZZ$ZZZZZZZZZZZZZZZZZZ$?ZZO~ZO7ZZZZO$7=,=ZZZZOZ........+ZO.    \r\n" + 
				"                      ....Z=.$$OOZZZZO+,ZZZZZZZZZZZZZI.Z~...,.,$Z.Z=ZZZZO:?7+::$ZZZOZ?......,ZZ:    \r\n" + 
				"                      ...=$.IZ?....?ZO.=ZZZZZZZZZZZZOZ=$?,~==:.IZ.O.ZZZZZ+?I7,:ZZZZZZZZO$....ZZ+    \r\n" + 
				"                     ....O..OZ.O....~O.,ZZZZZZ:.?ZZZO$Z=.~7.?:?O7$~.ZZ$Z$$~+,:ZZ$$$ZOZZZZO...ZZ$    \r\n" + 
				"                 .... ..~O..Z.Z,....?Z.Z?:ZZZZ~+ZZ$Z.ZZ..,?ZZ?,.ZO.OOZZ$OO$OOZZOZ$7,..O$ZO...OO$    \r\n" + 
				"                ..$?Z:..Z,.:Z.O. . .+O:.ZZZZZZZZO+ZOO.OZZO.,.?~IZZZOOO:Z..,~=~....    .ZZZ$OOZZ,    \r\n" + 
				"                ..,=..,Z...$O.Z.   ..O.ZO$ZZZZZZO$O.ZZOZZZ,.ZZZZZZZO.Z:...........    .OZ7ZZZO~.    \r\n" + 
				"            . ....O..=.,.$.I:.=.. ...ZZOZZZZZZZZZZZOOI,,ZZZ7ZZZZ7,+O,. ..   .....     .OZ?ZZZ=..    \r\n" + 
				"         ..  .....:=~+.Z..~O.........$O$OZ.~ZZZZZZZZOZOZO$$Z?,,$O,,... .  ......   ....ZZ~7O,...    \r\n" + 
				"         ........O.7,:,=.,Z..$.......=Z.:,+,OZZZZZ$7?+~~IZOO~....          ....... ...ZZZ..~..      \r\n" + 
				"          ..7ZOZ:+.Z,..,ZO.,.O.......?ZZ,I,7~.OZZZZZOZZZZ,. .....          .........?ZZZ$.....      \r\n" + 
				"      ..  .7~=O$===.,++:.?=.Z....  ..ZO:::+~ZOZZZOZZ$ZZZ?.                      ....ZZZZ........    \r\n" + 
				"      . . .+.O.,....,~OZO+.=....  ..~OZZ$Z+~$$Z.ZZZ$OZZZ..                      ...7ZZZ...    ..    \r\n" + 
				"      .....,O,?.....$ZZZ..~+. .....,OZO$ZZZZO$..OZZZZZI...                      ..,O$$~.....        \r\n" + 
				"     ...O..+ZZZZZZZZZ$...$...   .~ZZ$OZOZZI.....ZZZ$O.....                      . .,ZO...           \r\n" + 
				"   ....,O..=ZZZZO7.....$,. .   .OZOZZZ7,.......ZOZZ....                         .  .$=....          \r\n" + 
				"   ..7Z=:,=.........$Z:=... ....ZZ$O...... . +ZOZ?...                              ....             \r\n" + 
				"   =,..~~~::~~IZO$:.O:....   ...ZZ.. . .... .OZZ...  .                               ..             \r\n" + 
				"   7Z.....8$?=O:,.ZO,?...    ..ZZ...         .OZ....                                                \r\n" + 
				"   ....:ZZ.OZ,...OZ.O,. ..  ..Z$:...  ..    ..ZOI.. .                           ..                  \r\n" + 
				"   ...OO.:Z~..  .OZ:~ZOZ.,  .=ZZ,.......     .,ZZ..                          ......                 \r\n" + 
				"   ..:I ,Z~.......$Z?.... ...$OZ~.....      ...Z$O.. .......                  ..  .                 \r\n" + 
				"   ..O:.:$:............. ...7ZZZZ.....      ...ZZZI.........                 ...                    \r\n" + 
				"   ..~Z=,.Z+.......  .   ...?ZZZO?...       . .~ZOOZ........               .. .                     \r\n" + 
				"   ...ZOOZOZZ~... .      .....ZZZZ,.        ....=ZZZ=........            ....                       \r\n" + 
				"   ......,......          ....+ZZZZ. .       ...,ZZZZZ.. .     .. .       ..                        \r\n" + 
				"    .  . ..        . .      .. .   ..            ... . ..    .. . . .                               \r\n" + 
				"         .   ..               ..   . .            .. ....   .   . .      .          \r\n" +
				"You are a Horse! Those born under the Chinese Zodiac sign of the Horse love to roam free. They’re  \r\n" +
				"energetic, self-reliant, money-wise, and they enjoy traveling, love and intimacy. They’re great at  \r\n" +
				"seducing, sharp-witted, impatient and sometimes seen as a drifter. Compatible with Dog or Tiger.");
		break;
	case 11:
		System.out.println(".................................=OZZZOZZZOZZ,............... ......... ......... ..................\r\n" + 
				"...............................ZZZ,ZZZZZZZIZZZZ................. .......................... ........\r\n" + 
				".............................$ZZZZZ.ZZZZZZ,ZZZZZZ......... .........................................\r\n" + 
				"............................ZZZZ,OZ?Z:.,ZZZZO.ZZZZ....... ..........................................\r\n" + 
				"...........................ZZZZZZ=Z...ZZO?.,ZZZZ+Z+.................................................\r\n" + 
				"..........................ZZZZZ,ZZ..Z?ZZZZ?Z.OO$ZZZ.................................................\r\n" + 
				".........................ZZZZZZZZ.=IZZ=,7.OZZ.ZZZZZ............................... .................\r\n" + 
				".........................Z,ZZZ$,Z.ZZZ:$,.,.ZZ.ZZZZZ.................................................\r\n" + 
				"........................OZZZZZZZZ.ZZZ,Z=..ZZ7,ZZZZZ.................................................\r\n" + 
				"........................ZZ,=Z$,~Z.ZZ:O.$ZZZ,,ZZOZZ..................................................\r\n" + 
				"........................OZZZZZZZZ.,Z7...:,...:ZZZ,..................................................\r\n" + 
				"........................~ZZ$...ZZ.$ZZZZZZZZZZZZZ....................................................\r\n" + 
				".........................ZZZZZZZZOZZZZ7ZZZ7ZZ,ZZZZZ.................................................\r\n" + 
				"................ZZZO.....ZZZZZZZZZZ+ZZZ7ZZ.ZZ.ZZZ7ZZZ...............................................\r\n" + 
				"...............Z$..:..~ZZZZZZZZ:ZZZZ:OZ=ZZZZZZZZ+ZZZZZ..............................................\r\n" + 
				"...............ZZ.O..ZZZZZZZZZZZZ~ZZ$ZZZ+......=ZZZZZZZ.............................................\r\n" + 
				"................ZZZZZZZZZZZZZZZZZZZZZ?.=OZZZZZ$..ZZZZZZZ............................................\r\n" + 
				"...................IZZZZZZZZZZZZZZZZ,.ZZZZZZZ?Z$..ZZZZOZ............................................\r\n" + 
				"...................ZZZZZZZZZZZZZZZZZ.ZZ,Z,~77,=ZZ.ZOZZZZ............................................\r\n" + 
				"..................ZZZZZZZZZZZZZZZZZZ$ZZZ,Z$..Z?O7.ZZZZZZ.......................................... .\r\n" + 
				"................ZZZZZZZZZZZZZZZZZZZ~ZZZ$.ZI..:ZZZ.ZZZOZZ.....................................ZOIZZ..\r\n" + 
				"...............ZZZZZZ$ZZZIZZZZZZZZZ~ZZ,,O.ZZZOZZ.Z$ZZZZ~ ....................................Z...ZZ.\r\n" + 
				".............OZZZZZZZZ...ZZZZZZZZZZZ.ZZZZZ..,..,ZZZ::ZZ.........................................:7Z:\r\n" + 
				"...........IZZZZZZZZZZZZZZZZZZZZZZZZZ:O~ZZZZZZZZ=ZZZZO.........................................$$OZZ\r\n" + 
				".........:ZZZZZZZZZZZZZZZZZZZZZZZZZZZZ.ZZZ,ZZZZZZZZZ.. ...............................7ZZZZZZZZ.Z?Z+\r\n" + 
				"........ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ..7ZZZZZZZ$. ...............................ZZZZZZZ$,..ZZ7ZZ.\r\n" + 
				".......ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ7..........................................,Z+.ZZ$$ZZ$I..:Z,?.\r\n" + 
				"......,ZZZZZZ,ZZZZZZZZZZZZZZZZZZZZZZZZ,..........................................ZO.ZZZZOOZOZZ+.Z...\r\n" + 
				"............?ZZZZZZZZZZZZZZZZZZZZZZZZZ=...O$....................................7~.,ZZZZZOZZZZZ.....\r\n" + 
				"........?ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ..Z..Z.................................+Z~OZZZZZZZZZ... .....\r\n" + 
				"...........ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ+7ZZ.................=ZZZZZZZZZZZOZZZZZ....................\r\n" + 
				"...........OZZZZ+....ZZZZZZZZZZZZZZZZZZZZZZ,...........7ZZZ.....OZZZZZZZ$..,ZZZ.....................\r\n" + 
				"...........Z:Z.......ZZZZZZZZZZZZZZZZZZZZZZZO?:,:IZZZZZZ,.:.ZZZZ..ZZZZ..=+~.,Z,Z....................\r\n" + 
				".............$,......ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ.Z=IZ7...O..ZZ.ZZZZZZZIZZZ...................\r\n" + 
				".............. ......ZZZZZZZZZZZZZZZZZZZZZ....$ZZZZZZZ.ZZ.ZZ.OZO...ZZZ=.ZZZZZZ~ZZZ..................\r\n" + 
				"....................OZZZZZZZZZZZZZZZZZZZ?.ZZZ...OZZZZ~OZZ,ZZ..$O,.=ZZZZZ,..OZZZZZZ..................\r\n" + 
				"..................?ZZZZZZZZZZZZZZZZZZZZZ.ZOZZZ.+.ZZZZZZZZZZZZ$...ZZZZZ..ZO$,..ZZZZ$.................\r\n" + 
				".................Z,ZZ$ZZZZZZZZZZZZZZZZ~ZZ.~,ZZZ...ZZ7ZZZZZZZZZZZZZZZZZ.7Z.ZZ7..ZZZZ.................\r\n" + 
				"................ZZ+ZZ.ZZZZ.Z$?Z:7+.Z.$=O.OZZZZZ.Z.$ZZZZZZZZZZZZZZZZZZZZ..~ZZZZ..ZZZ.................\r\n" + 
				"...............ZIZZ.ZZ.OZZZZ.OZ.+O.Z.Z~ZI.ZZZZZ.Z.,ZZZZZ..........ZZZZZZZZZZZ7Z.ZZZ.................\r\n" + 
				"...............ZZZZZ.ZZZ....ZZZZZZ.ZZZZZ7.ZZZZZ.Z..ZZZ.....IZZ?.....ZZZZZZZZZ:Z.ZZZ.................\r\n" + 
				"..............ZZZZ,ZZ..~ZZZZZZZ7..ZZZZZZ..ZZZZZ.Z..ZZ...$ZZZZZZZZZ...7ZZZZZZZ=Z.ZZZ.................\r\n" + 
				"..............7ZZZZZ.ZZZ,.....Z.+ZZZZZZ.$.ZZZZ..Z..Z..+ZZZZ.....ZZZ...ZZZZZZ:$Z.ZZ..................\r\n" + 
				"..........:OOOZZZZZZZZ$......,OZZZZZZZ.$.ZZZZZ.ZZ.+..,ZZZZ...$Z..+Z~..~ZZZZZ.ZZ.ZZ..................\r\n" + 
				"..,?OZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZO..O.ZZZZZ..ZZ.Z..ZZZZ..I$OZZ..ZZ...ZZZZ:IZ.ZZ. .................\r\n" + 
				"7ZZZZZZZZZZZZZZZZ,ZZZZZZZZZZZZZZZI.=Z$.ZZZZZ7.ZZ..Z..ZZZZ..Z.ZZZ.,Z...ZZZZZ.ZZ$Z?...................\r\n" + 
				"ZZZZZZZZZZZZZZZZZZZZ=.:OZZZI,..~ZZZZ..OZZZZ$.~O$.ZZ..ZZZZ...Z$..$Z:...ZZZZ.ZZ=Z?....................\r\n" + 
				"ZZZZZZZZZZZZZZZZZZZZZZZZOZZZZZZZZZ..ZZZZZZ?.:ZZ.ZZZ..ZZZZZ...,:=.. ..ZZZI.ZZZZ:.....................\r\n" + 
				"ZZZZZZ.....,~+??=$.7ZZZZZZZZZZZ...ZZZZZZZ,.ZZZ.OZZZZ.OZZZZZ,.......OZZZ.OZZZZ.......................\r\n" + 
				".ZZZZZZ............ZZ.........+ZZZZZZZZ:..ZZZ.ZZZZZZ7.ZZZZZZZZZZZZZZZ.=OZZZZZ.......................\r\n" + 
				"..ZZZZZ: ..........ZZZZZZZZZZZZZZZZZO...ZZZ7ZZZZZZZ,.O,ZZZZZZZZZZZ,,ZZZZZZZZZZOZ....................\r\n" + 
				"..ZZZZZZ...........ZZZZZZZZZZZZZZ,..,ZZZZZIZZZ:.....ZZZ,OZZZZZZZZZZZZZZZZZZZZZZZZZ..................\r\n" + 
				"...ZZZZZ..........ZZZZZZZZ..OZZZZZZZZO7,.... ......ZZZZZZZ$ZZZZZZZZZZZZZZZZZZZZZZZ..................\r\n" + 
				"...ZZZZZ~.........ZZZZZZZ.........................7ZZZZZZZZ...7OZZZZZZ$IZOZZZZZZZO..................\r\n" + 
				"...ZZZZZ7........ZZZZZZZ:........................:ZZZZZZZ~................ZZZZZZZ...................\r\n" + 
				"...ZZZZZI.......:ZZZZZZ.........................,ZZZZZZ?...................ZZZZZ....................\r\n" + 
				"..ZZZZZZ........ZZZZZZ.........................,ZZZZZ$.....................ZZZZ?....................\r\n" + 
				".ZZ.ZZZO......:ZZZZZ+.........................,ZZZZZ......................ZZZZZ.....................\r\n" + 
				".............8ZZZZZ...........................ZZZZZ.......................ZZZZ......................\r\n" + 
				"............$ZZZZZ...........................ZZZZZ:......................ZZZZZ......................\r\n" + 
				"...........ZZZZZZ...........................ZZZZZZ......................=ZZZZ.......................\r\n" + 
				"..........ZZZZZZ...........................ZZZZZZZ......................ZZZZZ.......................\r\n" + 
				".........$ZZZZZ...........................IZZZZZZ......................ZZZZZ,.......................\r\n" + 
				"........,ZZZZZZ...........................ZZZZZZZ.....................ZZZZZZ........................\r\n" + 
				"........ZZZZZZ,..........................ZZZZZZZ$....................ZZZZZZ,........................\r\n" + 
				".......?Z.ZZZ,...........................ZZ,ZZ+.....................~Z.ZZZ..........................\r\n" +
				"You are a Ram! Those born under the Chinese Zodiac sign of the Goat enjoy being alone in their thoughts.\r\n" +
				" They’re creative, thinkers, wanderers, unorganized, high-strung and insecure, and can be anxiety-ridden.\r\n" +
				" They need lots of love, support and reassurance. Appearance is important too. Compatible with Boar or \r\n" +
				"Rabbit.");
		break;
		
	}
	

	}

}
