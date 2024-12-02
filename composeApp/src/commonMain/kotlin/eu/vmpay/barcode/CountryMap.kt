package eu.vmpay.barcode

val countryMap = mapOf(
    "001" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),  // USA/Canada 🇺🇸
    "002" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "003" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "004" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "005" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "006" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "007" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "008" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "009" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "010" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "011" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "012" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "013" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "014" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "015" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "016" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "017" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "018" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "019" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "030" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "031" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "032" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "033" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "034" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "035" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "036" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "037" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "038" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "039" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "060" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "061" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "062" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "063" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "064" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "065" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "066" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "067" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "068" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "069" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "070" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "071" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "072" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "073" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "074" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "075" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "076" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "077" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "078" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "079" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "080" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "081" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "082" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "083" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "084" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "085" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "086" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "087" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "088" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "089" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "090" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "091" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "092" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "093" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "094" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "095" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "096" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "097" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "098" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "099" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "100" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "101" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "102" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "103" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "104" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "105" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "106" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "107" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "108" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "109" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "110" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "111" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "112" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "113" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "114" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "115" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "116" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "117" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "118" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "119" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "120" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "121" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "122" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "123" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "124" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "125" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "126" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "127" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "128" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "129" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "130" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "131" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "132" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "133" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "134" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "135" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "136" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "137" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "138" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),
    "139" to ("USA" to "\uD83C\uDDFA\uD83C\uDDF8"),

    "300" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),    // France 🇫🇷
    "301" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "302" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "303" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "304" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "305" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "306" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "307" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "308" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "309" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "310" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "311" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "312" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "313" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "314" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "315" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "316" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "317" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "318" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "319" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "320" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "321" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "322" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "323" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "324" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "325" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "326" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "327" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "328" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "329" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "330" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "331" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "332" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "333" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "334" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "335" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "336" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "337" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "338" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "339" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "340" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "341" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "342" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "343" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "344" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "345" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "346" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "347" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "348" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "349" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "350" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "351" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "352" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "353" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "354" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "355" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "356" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "357" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "358" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "359" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "360" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "361" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "362" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "363" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "364" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "365" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "366" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "367" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "368" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "369" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "370" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "371" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "372" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "373" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "374" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "375" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "376" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "377" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "378" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),
    "379" to ("France" to "\uD83C\uDDEB\uD83C\uDDF7"),

    "380" to ("Bulgaria" to "\uD83C\uDDE7\uD83C\uDDEC"),
    "383" to ("Slovenia" to "\uD83C\uDDF8\uD83C\uDDEE"),
    "385" to ("Croatia" to "\uD83C\uDDED\uD83C\uDDF7"),
    "387" to ("Bosnia and Herzegovina" to "\uD83C\uDDEE\uD83C\uDDF6"),
    "389" to ("Montenegro" to "\uD83C\uDDF2\uD83C\uDDEA"),

    "400" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),   // Germany 🇩🇪
    "401" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "402" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "403" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "404" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "405" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "406" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "407" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "408" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "409" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "410" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "411" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "412" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "413" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "414" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "415" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "416" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "417" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "418" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "419" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "420" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "421" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "422" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "423" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "424" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "425" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "426" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "427" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "428" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "429" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "430" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "431" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "432" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "433" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "434" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "435" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "436" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "437" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "438" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "439" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),
    "440" to ("Germany" to "\uD83C\uDDE9\uD83C\uDDEA"),

    "450" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "451" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "452" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "453" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "454" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "455" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "456" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "457" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "458" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "459" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),

    "460" to ("Russia" to "\uD83D\uDCA9"),
    "461" to ("Russia" to "\uD83D\uDCA9"),
    "462" to ("Russia" to "\uD83D\uDCA9"),
    "463" to ("Russia" to "\uD83D\uDCA9"),
    "464" to ("Russia" to "\uD83D\uDCA9"),
    "465" to ("Russia" to "\uD83D\uDCA9"),
    "466" to ("Russia" to "\uD83D\uDCA9"),
    "467" to ("Russia" to "\uD83D\uDCA9"),
    "468" to ("Russia" to "\uD83D\uDCA9"),
    "469" to ("Russia" to "\uD83D\uDCA9"),

    "470" to ("Kyrgyzstan" to "\uD83C\uDDF0\uD83C\uDDEC"),
    "471" to ("Taiwan" to "\uD83C\uDDF9\uD83C\uDDFC"),
    "474" to ("Estonia" to "\uD83C\uDDEA\uD83C\uDDEA"),
    "475" to ("Latvia" to "\uD83C\uDDF1\uD83C\uDDFB"),
    "476" to ("Azerbaijan" to "\uD83C\uDDE6\uD83C\uDDFF"),
    "477" to ("Lithuania" to "\uD83C\uDDF1\uD83C\uDDF9"),
    "478" to ("Uzbekistan" to "\uD83C\uDDF8\uD83C\uDDFF"),
    "479" to ("Sri Lanka" to "\uD83C\uDDF1\uD83C\uDDF0"),
    "480" to ("Philippines" to "\uD83C\uDDF5\uD83C\uDDF8"),
    "481" to ("Belarus" to "\uD83C\uDDE7\uD83C\uDDFE"),
    "482" to ("Ukraine" to "\uD83C\uDDE6\uD83C\uDDFA"),
    "483" to ("Turkmenistan" to "\uD83C\uDDF9\uD83C\uDDFF"),
    "484" to ("Moldova" to "\uD83C\uDDF2\uD83C\uDDED"),
    "485" to ("Armenia" to "\uD83C\uDDE6\uD83C\uDDFF"),
    "486" to ("Georgia" to "\uD83C\uDDEC\uD83C\uDDEA"),
    "487" to ("Kazakhstan" to "\uD83C\uDDF0\uD83C\uDDFF"),
    "488" to ("Tajikistan" to "\uD83C\uDDF9\uD83C\uDDFF"),
    "489" to ("Hong Kong" to "\uD83C\uDDED\uD83C\uDDF0"),
    "490" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"), // Japan (original Japanese Article Number range)
    "491" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "492" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "493" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "494" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "495" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "496" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "497" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "498" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "499" to ("Japan" to "\uD83C\uDDEF\uD83C\uDDF5"),
    "500" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"), // United Kingdom
    "501" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "502" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "503" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "504" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "505" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "506" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "507" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "508" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "509" to ("United Kingdom" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "520" to ("Greece" to "\uD83C\uDDEC\uD83C\uDDE7"), // Greece
    "521" to ("Greece" to "\uD83C\uDDEC\uD83C\uDDE7"),
    "528" to ("Lebanon" to "\uD83C\uDDF1\uD83C\uDDEC"), // Lebanon
    "529" to ("Cyprus" to "\uD83C\uDDE8\uD83C\uDDED"), // Cyprus
    "530" to ("Albania" to "\uD83C\uDDE6\uD83C\uDDF1"), // Albania
    "531" to ("North Macedonia" to "\uD83C\uDDF2\uD83C\uDDF0"), // North Macedonia
    "535" to ("Malta" to "\uD83C\uDDF2\uD83C\uDDF8"), // Malta
    "539" to ("Ireland" to "\uD83C\uDDEE\uD83C\uDDEA"), // Ireland
    "540" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"), // Belgium
    "541" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "542" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "543" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "544" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "545" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "546" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "547" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "548" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "549" to ("Belgium" to "\uD83C\uDDE7\uD83C\uDDEA"),
    "560" to ("Portugal" to "\uD83C\uDDF5\uD83C\uDDF9"), // Portugal
    "569" to ("Iceland" to "\uD83C\uDDEE\uD83C\uDDF8"), // Iceland
    "570" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"), // Denmark
    "571" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "572" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "573" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "574" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "575" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "576" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "577" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "578" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "579" to ("Denmark" to "\uD83C\uDDE9\uD83C\uDDF0"),
    "590" to ("Poland" to "\uD83C\uDDF5\uD83C\uDDF0"), // Poland
    "594" to ("Romania" to "\uD83C\uDDF7\uD83C\uDDF4"), // Romania
    "599" to ("Hungary" to "\uD83C\uDDED\uD83C\uDDFA"), // Hungary
    "600" to ("South Africa" to "\uD83C\uDDE7\uD83C\uDDFF"), // South Africa
    "601" to ("South Africa" to "\uD83C\uDDE7\uD83C\uDDFF"),
    "603" to ("Ghana" to "\uD83C\uDDEC\uD83C\uDDED"), // Ghana
    "604" to ("Senegal" to "\uD83C\uDDF8\uD83C\uDDEC"), // Senegal
    "605" to ("Uganda" to "\uD83C\uDDFE\uD83C\uDDF9"), // Uganda
    "606" to ("Angola" to "\uD83C\uDDE6\uD83C\uDDF4"), // Angola
    "607" to ("Oman" to "\uD83C\uDDF4\uD83C\uDDF2"), // Oman
    "608" to ("Bahrain" to "\uD83C\uDDED\uD83C\uDDE7"), // Bahrain
    "609" to ("Mauritius" to "\uD83C\uDDF2\uD83C\uDDF8"), // Mauritius
    "611" to ("Morocco" to "\uD83C\uDDF2\uD83C\uDDC6"), // Morocco
    "613" to ("Algeria" to "\uD83C\uDDE9\uD83C\uDDFF"), // Algeria
    "615" to ("Nigeria" to "\uD83C\uDDF3\uD83C\uDDEC"), // Nigeria
    "616" to ("Kenya" to "\uD83C\uDDF0\uD83C\uDDEC"), // Kenya
    "617" to ("Cameroon" to "\uD83C\uDDE8\uD83C\uDDF2"), // Cameroon
    "618" to ("Ivory Coast" to "\uD83C\uDDEE\uD83C\uDDEF"), // Ivory Coast
    "619" to ("Tunisia" to "\uD83C\uDDF9\uD83C\uDDF3"), // Tunisia
    "620" to ("Tanzania" to "\uD83C\uDDF9\uD83C\uDDFC"), // Tanzania
    "621" to ("Syria" to "\uD83C\uDDF8\uD83C\uDDEA"), // Syria
    "622" to ("Egypt" to "\uD83C\uDDE8\uD83C\uDDF3"), // Egypt
    "624" to ("Libya" to "\uD83C\uDDF1\uD83C\uDDE6"), // Libya
    "625" to ("Jordan" to "\uD83C\uDDEF\uD83C\uDDEA"), // Jordan
    "626" to ("Iran" to "\uD83C\uDDEE\uD83C\uDDF7"), // Iran
    "627" to ("Kuwait" to "\uD83C\uDDF0\uD83C\uDDFC"), // Kuwait
    "628" to ("Saudi Arabia" to "\uD83C\uDDE8\uD83C\uDDF4"), // Saudi Arabia
    "629" to ("United Arab Emirates" to "\uD83C\uDDE6\uD83C\uDDEA"), // United Arab Emirates
    "630" to ("Qatar" to "\uD83C\uDDF6\uD83C\uDDFC"), // Qatar
    "631" to ("Namibia" to "\uD83C\uDDF3\uD83C\uDDF2"), // Namibia
    "632" to ("Rwanda" to "\uD83C\uDDFC\uD83C"), // Rwanda
    "640" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"), // Finland
    "641" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "642" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "643" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "644" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "645" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "646" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "647" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "648" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "649" to ("Finland" to "\uD83C\uDDEB\uD83C\uDDEE"),
    "680" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"), // China
    "681" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "682" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "683" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "684" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "685" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "686" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "687" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "688" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "689" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "690" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"), // China
    "691" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "692" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "693" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "694" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "695" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "696" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "697" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "698" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "699" to ("China" to "\uD83C\uDDE8\uD83C\uDDF3"),
    "700" to ("Norway" to "\uD83C\uDDF3\uD83C\uDDF4"), // Norway
    "729" to ("Israel" to "\uD83C\uDDEE\uD83C\uDDF1"), // Israel
    "730" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"), // Sweden
    "731" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "732" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "733" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "734" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "735" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "736" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "737" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "738" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "739" to ("Sweden" to "\uD83C\uDDF8\uD83C\uDDEA"),
    "740" to ("Guatemala" to "\uD83C\uDDEC\uD83C\uDDE9"), // Guatemala
    "741" to ("El Salvador" to "\uD83C\uDDEA\uD83C\uDDF8"), // El Salvador
    "742" to ("Honduras" to "\uD83C\uDDFD\uD83C\uDDE8"), // Honduras
    "743" to ("Nicaragua" to "\uD83C\uDDF3\uD83C\uDDEA"), // Nicaragua
    "744" to ("Costa Rica" to "\uD83C\uDCCF\uD83C\uDDE8"), // Costa Rica
    "745" to ("Panama" to "\uD83C\uDDF5\uD83C\uDDF0"), // Panama
    "746" to ("Dominican Republic" to "\uD83C\uDDF0\uD83C\uDDE7"), // Dominican Republic
    "750" to ("Mexico" to "\uD83C\uDDF2\uD83C\uDDFD"), // Mexico
    "754" to ("Canada" to "\uD83C\uDDE8\uD83C\uDDE6"), // Canada
    "755" to ("Canada" to "\uD83C\uDDE8\uD83C\uDDE6"),
    "759" to ("Venezuela" to "\uD83C\uDDFB\uD83C\uDDEA"), // Venezuela
    "760" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"), // Switzerland
    "761" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "762" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "763" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "764" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "765" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "766" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "767" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "768" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "769" to ("Switzerland" to "\uD83C\uDDED\uD83C\uDDF8"),
    "770" to ("Colombia" to "\uD83C\uDDF0\uD83C\uDDF8"), // Colombia
    "771" to ("Colombia" to "\uD83C\uDDF0\uD83C\uDDF8"),
    "773" to ("Uruguay" to "\uD83C\uDDFA\uD83C\uDDF8"), // Uruguay
    "775" to ("Peru" to "\uD83C\uDDF5\uD83C\uDDEA"), // Peru
    "777" to ("Bolivia" to "\uD83C\uDDE7\uD83C\uDDF4"), // Bolivia
    "778" to ("Argentina" to "\uD83C\uDDE6\uD83C\uDDF7"), // Argentina
    "779" to ("Argentina" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "780" to ("Chile" to "\uD83C\uDDE8\uD83C\uDDF1"), // Chile
    "784" to ("Paraguay" to "\uD83C\uDDF5\uD83C\uDDFE"), // Paraguay
    "786" to ("Ecuador" to "\uD83C\uDDEA\uD83C\uDDE8"), // Ecuador
    "789" to ("Brazil" to "\uD83C\uDDE7\uD83C\uDDF7"), // Brazil
    "790" to ("Brazil" to "\uD83C\uDDE7\uD83C\uDDF7"),
    "800" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),     // Italy 🇮🇹
    "801" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "802" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "803" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "804" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "805" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "806" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "807" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "808" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "809" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "810" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "811" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "812" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "813" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "814" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "815" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "816" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "817" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "818" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "819" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "820" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "821" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "822" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "823" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "824" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "825" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "826" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "827" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "828" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "829" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "830" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "831" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "832" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "833" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "834" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "835" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "836" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "837" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "838" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "839" to ("Italy" to "\uD83C\uDDEE\uD83C\uDDF9"),
    "840" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"), // Spain
    "841" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "842" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "843" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "844" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "845" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "846" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "847" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "848" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "849" to ("Spain" to "\uD83C\uDDEA\uD83C\uDDF8"),
    "850" to ("Cuba" to "\uD83C\uDDED\uD83C\uDDFA"), // Cuba
    "858" to ("Slovakia" to "\uD83C\uDDF8\uD83C\uDDF0"), // Slovakia
    "859" to ("Czech Republic" to "\uD83C\uDDE8\uD83C\uDDFF"), // Czech Republic
    "860" to ("Serbia" to "\uD83C\uDDF7\uD83C\uDDEC"), // Serbia
    "865" to ("Mongolia" to "\uD83C\uDDF2\uD83C\uDDF0"), // Mongolia
    "867" to ("North Korea" to "\uD83C\uDDF0\uD83C\uDDF5"), // North Korea
    "868" to ("Turkey" to "\uD83C\uDDF9\uD83C\uDDF7"), // Turkey
    "869" to ("Turkey" to "\uD83C\uDDF9\uD83C\uDDF7"),
    "870" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"), // Netherlands
    "871" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "872" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "873" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "874" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "875" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "876" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "877" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "878" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "879" to ("Netherlands" to "\uD83C\uDDF3\uD83C\uDDF1"),
    "880" to ("South Korea" to "\uD83C\uDDF0\uD83C\uDDF7"), // South Korea
    "881" to ("South Korea" to "\uD83C\uDDF0\uD83C\uDDF7"),
    "883" to ("Myanmar" to "\uD83C\uDDF2\uD83C\uDDF2"), // Myanmar
    "884" to ("Cambodia" to "\uD83C\uDDED\uD83C\uDDF2"), // Cambodia
    "885" to ("Thailand" to "\uD83C\uDDF9\uD83C\uDDED"), // Thailand
    "888" to ("Singapore" to "\uD83C\uDDF8\uD83C\uDDEC"), // Singapore
    "890" to ("India" to "\uD83C\uDDEE\uD83C\uDDF3"), // India
    "893" to ("Vietnam" to "\uD83C\uDDFB\uD83C\uDDF3"), // Vietnam
    "896" to ("Pakistan" to "\uD83C\uDDF5\uD83C\uDDF0"), // Pakistan
    "899" to ("Indonesia" to "\uD83C\uDDEE\uD83C\uDDE9"), // Indonesia
    "900" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"), // Austria
    "901" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "902" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "903" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "904" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "905" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "906" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "907" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "908" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "909" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "910" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "911" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "912" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "913" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "914" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "915" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "916" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "917" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "918" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "919" to ("Austria" to "\uD83C\uDDE6\uD83C\uDDF9"),
    "930" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"), // Australia
    "931" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "932" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "933" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "934" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "935" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "936" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "937" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "938" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "939" to ("Australia" to "\uD83C\uDDE6\uD83C\uDDF7"),
    "940" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"), // New Zealand
    "941" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "942" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "943" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "944" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "945" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "946" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "947" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "948" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "949" to ("New Zealand" to "\uD83C\uDDF3\uD83C\uDDE8"),
    "955" to ("Malaysia" to "\uD83C\uDDF2\uD83C\uDDF8"), // Malaysia
    "958" to ("Macau" to "\uD83C\uDDF2\uD83C\uDDF0"), // Macau
)