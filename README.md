# Tips 使用 android studio 開發 java
https://www.itread01.com/content/1543211946.html 參考網址<br>

做法：<br>
1.新建專案 new project<br>
2.新建模組 new module<br>
3.模組選擇 java Library<br>
4.命名模組名稱<br>
5.在模組內 new class<br>
6.命名 class 名稱<br>
7.在 class 開始撰寫 java 程式<br>

# Head First Java
https://github.com/bethrobson/Head-First-Java 作者 github<br>

# 第一章 - 進入 Java 的世界
1.Java 的運作方式<br>
2.Java 簡史<br>
3.Java 的程式架構<br>
4.剖析 Class<br>
5.解釋 main<br>
6.whlie 迴圈範例<br>
7.條件式分支<br>
8.編輯器與 JVM<br>
9.基本練習<br>

# 第二章 - 拜訪物件村
1.介紹何謂物件<br>
2.程序化開發和物件導向開發的差別<br>
3.Java OO 的繼承<br>
4.以物件的角度來思考<br>
5.class 和 object 兩者的不同<br>
6.建構物件<br>
7.main() 的兩項用途：<br>
A：測試真正的 class<br>
B：啟動你的 Java 應用程式<br>
8.Java 擁有可回收機制(Garbage-Collectivle)，會回收不在被使用到的物件釋放記憶體<br>
9.練習題<br>

# 第三章 - 認識變數
1.變數有兩種：primitive 與 reference。<br>
2.宣告變數<br>
3.變數有兩條重要規則：第一條變數必須要有型別。另一條規則是必須要有名稱。<br>
4.變數大小與變數溢位<br>
5.避開命名關鍵字：<br>
A：名稱必須以字母、底線(_)、或 $ 符號開頭，不能用數字。<br>
B：除了第一個字元以外，後面就可以用數字。不要用在第一個字元即可。<br>
C：避開 Java 的保留字，例如：public static void 這三組。其他的請查看保留字一覽表或者上網查詢<br>
6.物件參考<br>
7.物件的宣告、建構與指派有三個步驟例：Dog myDog = new Dog();<br>
A：宣告一個 reference variable (Dog myDog)<br>
B：建構 object (new Dog())<br>
C：連接 object 與 reference (=)<br>
8.在垃圾回收 Heap 上的生活<br>
9.介紹陣列<br>
10.Java 在乎型別，一旦陣列被宣告出來，你就只能塞入所宣告型別的元素<br>

# 第四章 - 物件行為
1.狀態影響行為，行為影響狀態。<br>
2.物件有狀態和行為。<br>
3.method 的參數與操作實體變數 (簡單說就是介紹回傳值以及參數值)<br>
4.運用參數與回傳型別 (Getter 與 Setter)<br>
5.介紹封裝<br>
6.封裝基本原則：將基本變數標示為 private ，將 getters 與 setters 標示為 public<br>
7.使用封裝的好處：<br>
A：就是保護你的變數不會被別人強制修改，而必須透過 getters 與 setters 做處理。<br>
B：直接存取變數，當你要對變數做更動時，其他存取到該變數的方法也必須修改。<br>
但封裝變數不需要，只需要在封裝裡面修改即可，不需要修改存取到該變數的方法。<br>
8.陣列中物件的行為<br>
9.宣告與初始化實體變數，實體變數永遠都會有預設值。如果你沒有明確的指派值給實體變數，或沒有呼叫 setter，實體變數還是會有值。<br>
10.全域變數與區域變數之間的差別，全域變數宣告在 class 中;區域變數宣告在 method 中，全域變數有預設值;區域變數沒有預設值。<br>
11.物件的相等 (用 == 或者 equals() )<br>

# 第五章 - 超強力 Method
1.實作船戰遊戲。<br>
2.開發 Class 流程：<br>
A：找出 Class 應該做的事情。<br>
B：列出實體變數與 method。<br>
C：編寫 method 的 precode。<br>
D：撰寫 method 的測試用程式。<br>
E：實作出 class。<br>
F：測試 method。<br>
G：除錯或重新設計。<br>
3.介紹 precode。<br>
4.precode 分為三類：<br>
A：instance variable 的宣告。<br>
B：method 的宣告。<br>
C：method 的邏輯。<br>
5.要點：<br>
A：你的 Java 程式應該從高階的設計開始。<br>
B：你通常會在建構新的 class 寫出下列三種東西：<br>
a.precode。<br>
b.測試碼。<br>
c.實際程式碼。<br>
C：precode 應該描述要做甚麼事情而不是如何做。<br>
D：實作 method 之前應該撰寫測試碼。<br>
E：如果知道要執行多少次，應該要使用 for 迴圈而不是 while。<br>
F：使用前置或者後製來遞增來對變數加一，例如說 x++。<br>
G：使用前置或者後製來遞減來對變數減一，例如說 x--。<br>
H：使用 Interger.parseInt() 來取得 String 的整數值。<br>
I：Interger.parseInt() 只會在所給的 String 為數字時有用。<br>
J：使用 break 命令來提前跳脫迴圈。<br>
6.Random() 與 getUserInput()<br>
7.比較 for 與 while 的差別<br>
8.加強版 for 迴圈用於 Java 5.0版本後<br>

# 第六章 - 使用 Java 函式庫
1.加強第五章的小程式<br>
2.當陣列不夠使用時，那就是用 ArrayList 吧!!!!<br>
3.介紹 ArrayList<br>
4.ArrayList 的操作步驟：<br>
A、建構 Arraylist<Egg> myList = new ArrayList<Egg>;<br>
B、加入元素 Egg s = new Egg(); myList.add(s);<br>
C、再加入元素 Egg b = new Egg(); myList.add(b);<br>
D、查詢大小 int theSize = myList.size();<br>
E、查詢特定元素 boolean isIn = myList.contains(s);<br>
F、查詢特定元素位置 int idx = myList.indexOf(b);<br>
G、判斷集合是否為空 boolean empty = myList.isEmpty();<br>
H、刪除元素 myList.remove(s);<br>
5.ArrayList 與陣列的比較：<br>
A、一般陣列在建構時就必須決定大小<br>
B、存放物件給一般陣列時必須指定位置<br>
C、一般陣列使用特殊的語法<br>
D、在 Java 5.0 中的 ArrayList 是參數化的 (parameterized)<br>
6.結構的細節<br>
7.完成 DotCom 最終版<br>
8.超強 Boolean 運算式<br>
9.使用函式庫 (Java API)<br>
10.你必須指明程式碼中所使用到的 class 的完整名稱 *<br>
11.使用 Java API 說明文件<br>

# 第七章 - 物件村的優質生活
1.前提概要<br>
2.繼承的運作方式<br>
3.繼承階層的設計：<br>
A：找出具有共通屬性與行為的物件<br>
B：設計代表共通狀態與行為的 class<br>
C：決定 subclass 是否需要讓某項行為(也就是 method 的實作)有特定不同的運作方式<br>
D：藉由尋找使用共通行為的 subclass 來找出更多抽象化機會<br>
E：完成 class 的繼承階層<br>
4.繼承樹的實用設計<br>
5.釋放物件的威力<br>
★繼承概念下的 IS-A 是個單向的關係!<br>
6.繼承有甚麼好處?<br>
A：避免重複的程式碼<br>
B：定義出共通的協議<br>
7.多型的運作<br>
8.同名異式-遵守合約：overriding 的規則：<br>
A：參數必須要一樣，而且回傳型別必須要相容<br>
B：method 的存取權不得縮小<br>
9.method 的過載(overload)：<br>
A：回傳型別可以不同<br>
B：不能只改變回傳型別<br>
C：可以更動存取權限<br>

# 第八章 - 深入多型
1.設計階層<br>
2.有些 class 不應該被抽象化，例如：Animal，因為你不知道他實際長怎樣。<br>
3.編輯器部會讓你初始抽象化(abstract)的class。<br>
4.abstract 的 class 除了被 extend 過以外，是沒有用途、沒有值、沒有目的的。<br>
5.抽象與具體的 class<br>
6.除了 class 可以抽象化，method 也可以抽象化。<br>
7.抽象 method 代表此 method 一定要被 override 過。<br>
8.如果你宣告出一個抽象的 method ，就必須將 class 也標示為抽象化(abstract) 的。<br>
9.你必須實作出所有抽象的 method。<br>
10.實作多型<br>
11.interface 與 polymorphism<br>
12.編輯器是根據參考型別來判斷有哪些 method 可以呼叫，而不是根據物件確實的型別。<br>
13.物件與 object<br>
14."多型"意味著"很多型式" 例如：Snowboard 可以當作 Snowboard 或者 object<br>
15.當你把物件塞進 ArrayList<Object> 時，你只能把它當作 Object。<br>
16.從 ArrayList<Object>取出參考時，參考的型別只會是 Object。<br>
17.物件型別轉換<br>
18.修改 class 階層<br>
19.有哪些方法可以在 PetShop 程式中 reuse 現有的 class?<br>
方法一：採用最簡單的做法，把寵物功能加進 Animal 中<br>
方法二：採用方法一，但是把寵物的行為設定成抽象的，強迫每個動物都必須 override 過該行為<br>
方法三：把功能接加到有需要的地方<br>
20.多重繼承<br>
21.使用 interface 來完成多重繼承的效果<br>
22.interface 解決致命方塊的辦法就是把全部的 method 弄成抽象。<br>
23.不同繼承樹的 class 也可以實作相同的 interface<br>
24.super 的使用<br>
  
# 第九章 - 物件的前世今生
1.每個物件有生有死，你必須為物件的生命循環週期負責。必須定義物件何時建構和何時死亡。<br>
2.Stack 與 Heap 的生存空間<br>
3.method 會被堆疊再一起<br>
4.Stack 上的物件參考<br>
5.建構物件三步驟：Duck myDuck = new Duck();<br>
A：宣告參考變數　Duck myDuck<br>
B：建構物件 new Duck();<br>
C：連接物件與參考 =<br>
6.method 有回傳型別，constructor 沒有回傳型別而且必須要和 class 名稱相同<br>
7.使用 Constructor 來初始化物件狀態<br>
8.過載與預設的 Constructor<br>
9.Overload 的意思代表你有一個以上的 constructor 且參數都不相同<br>
10.如果你寫了 Constructor，編譯器就不會在幫你預設 Constructor<br>
11.最好是有無參數的 Constructor 讓人可以選擇使用預設值。<br>
12.Constructor 必須記得的四件事：<br>
A：Constructor 是個 new 物件時會執行的程式<br>
B：Constructor 必須與 class 的名稱一樣並且沒有回傳型別<br>
C：如果你沒有寫 Constructor 的話，編譯器會幫妳寫一個沒有參數的<br>
D：一個 class 可以有很多個 Constructor ，但是不能有相同的參數型別和順序，這叫做 Overload 過的 Constructor<br>
13.superclass 的空間<br>
14.建構 Hippo 也代表建構 Animal 與 Object<br>
15.如何呼叫 superclass 的 Constructor? A：使用 super();<br>
16.從某個 Constructor 呼叫 Overload 版的另外一個 Constructor<br>
17.每個 Constructor 可以選擇呼叫 super() 或者 this()，但是不能同時呼叫。<br>
18.物件的壽命：<br>
A：區域變數只會存活在宣告該變數的 method 中<br>
B：實體變數的壽命與物件相同。如果物件還活著，則實體變數也會是活著的。<br>
19.參考變數的生命週期，當最後一個參考消失時，物件就會變成可回收的。<br>
20.有三種方式可以解散物件的參考：<br>
A：參考永久性的離開 scope<br>
B：參考被指派到其他的物件上<br>
C：直接將參考設定為 null<br>

# 第十章 - 數字很重要
1.Math 的 method：<br>
A：Math.random() 回傳介於0.0到趨近 1.0 之間的 double。<br>
B：Math.abs() 回傳 double 型別參數的絕對值。<br>
C：Math.round 根據參數是 float 或 double 回傳四捨五入之後的 int 或 long。<br>
D：Math.min() 回傳兩參數較小的那一個。<br>
E：Math.max() 回傳兩參數較大的那一個。<br>
2.在 Math 這個 class 中的所有 method 都不需要實體變數。而且因為這些 method 都是 static 的，所以你無須 Math 實體。你會用到的只有他 class 本身。<br>
3.非 static 與 static 的差別。<br>
4.靜態的 method 不能呼叫非靜態的變數。<br>
5.靜態的 method 不能呼叫非靜態的 method。<br>
6.靜態變數：他的值對所有實體來說都是相同的。<br>
7.靜態變數的功能 :被同 class 的所有實體共享的變數。<br>
8.靜態變數是共用的。<br>
9.同一 class 所有的實體共用一份靜態變數。<br>
10.靜態變數會在該 class 的任何靜態 method 執行之前就初始。<br>
11.靜態的 final 變數是常數(static final 常數)<br>
12.常數變數的名稱應該都要是全部大寫字母<br>
13.靜態 final 變數的初始化：<br>
A：宣告的時候<br>
B：在靜態起始程序中<br>
14.final 不只用在靜態變數上也可以拿來修飾非靜態的變數。例如：實體變數、去域變數、method 的參數。但是不管哪種都表示值不能變動。<br>
15.可以利用 final 來防止 method 的 override 或者製作 subclass。<br>
16.final 的變數代表你不能改變值。<br>
17.final 的 method 代表你不能 override 掉該 method。<br>
18.final 的 class 代表你不能 extend 過該 class (也就是建構她的 subclass)。<br>
19.靜態的 method 應該用 class 的名稱來呼叫。<br>
20.在 Java 5.0 之前當你需要以物件方式來處理 primitive 時，必須先包裝起來。<br>
21.在 Java 5.0 之後 autoboxing：不必把 primitive 與物件分得那麼清楚。<br>
22.可以用 autoboxing 包裝的地方：<br>
A：method 的參數<br>
B：回傳值<br>
C：boolean 運算式<br>
D：數值運算<br>
E：指派<br>
23.包裝靜態的工具性 method<br>
24.數字格式化(java.utill 中的 Firnatter)<br>
25.格式化兩個主要部分：<br>
A：格式指示<br>
B：要格式化的值<br>
26.format()<br>
27.在個是化指示中一定要給的是型別，如果還要指定其他項目的化，要把型別放在最後。<br>
28.介紹 format 使用在數值和日期<br>
29.使用 java.util.Calender 來操縱日期!<br>
30.要取得目前的日期時間就用 Date，其餘功能可以從 Calendar 上面找到<br>
31.運用 Calendar 物件與介紹<br>
32.靜態的 import ((個人不推<br>
33.靜態變數比較有效率。共用的 class 會省下很多記憶體!<br>

# 第十一章 - 有風險的行為
1.建構練習題。<br>
2.JavaSound API - MIDI 的介紹。<br>
3.呼叫有風險的 method，Java 使用 exception 來告訴呼叫的 method 有問題!!!<br>
4.例外是一種 Exception 型別的物件。<br>
5.method 可以抓住其他 method 所拋出的例外。例外總是會丟回給呼叫方。<br>
6.會拋出例外的 method 必須要宣告他可能會這樣做。<br>
7.編譯器會核對每件事，除了 RuntimeExceptions 以外，編譯器掛保證：<br>
A：如果你有拋出例外，你一定要使用 throw 來宣告這回事。<br>
B：如果你呼叫會拋出例外的 method，你必須確認你知道例外的可能性。將呼叫包在 try/catch 區段中是一種滿足編輯器的方法。<br>
8.try/catch 的流程控制。<br>
9.finally：無論如何都要執行的部分。<br>
10.處理多重的例外。<br>
11.例外也是多型(polymorphic)的：<br>
A：以例外的 supertype 來宣告會拋出的例外。<br>
B：以所拋出的例外 supertype 來 catch 例外。<br>
12.可以用 super 來處理所有例外但並不代表應該這樣做，因為每個需要獨特處理的例外撰寫不同的 catch 區塊。<br>
13.有多個 catch 區塊時要從小排到大。<br>
14.duck 掉例外。<br>
15.解決例外的兩種辦法，第一種處理(try/catch)，第二種逃避(duck 掉)。<br>
16.例外處理規則：<br>
A：catch 與 finally 不能沒有 try。<br>
B：try 與 catch 之間不能有程式。<br>
C：try 一定要有 catch 或 finally。<br>
D：只帶有 finally 的 try 必須要宣告例外。<br>
17.MIDI 的 Message 是 MidiEvent 的關鍵<br>
18.訊息的格式：<br>
A：訊息類型<br>
B：Channel<br>
C：要發出的音符<br>
D：力道<br>
19.改變訊息：<br>
A：改變音符<br>
B：改變音長<br>
C：改變樂器<br>

# 第十二章 - 看圖說故事
1.介紹圖形介面(GUI)。<br>
2.建構 GUI 步驟：<br>
A：製作 frame。<br>
B：製作 widger。<br>
C：把 widget 加入 frame 上。<br>
D：顯示出來。<br>
3.介紹使用者介面事件。<br>
4.使用者介面事件步驟：<br>
A：被按下時要執行的 method (也就是按鈕任務)。<br>
B：偵測按鈕被按下的方法，也是就是按鈕感應裝置。<br>
5.傾聽事件的處理 (listener)<br>
6.收到事件通知的步驟：<br>
A：實作 ActionListener 這個 interface。<br>
B：向按鈕登記 (對物件綁定傾聽事件)。<br>
C：定義事件處理的 method (實作 inteface 上的 method)。<br>
7.listener、來源與事件。<br>
8.在 GUI 上面加東西的三種方法：<br>
A：在 frame 上放置 widget。<br>
B：在 widget 上繪製 2D 圖形。<br>
C：在 widget 上繪製 JPEG 圖。<br>
9.自行建構繪圖組件。<br>
10.介紹 Graphics2D。<br>
11.GUI 的 layout ：超過一個以上的 widget 的 frame。<br>
12.多重 listener。<br>
13.當每個按鈕執行不同工作時候要如何對多個不同的按鈕分別取得事件?<br>
A：實作兩個 actionPerformed()。<br>
B：對兩個按鈕登記同一個 listener。<br>
C：建構不同的 ActionListener。<br>
14.內層 class 的介紹。<br>
15.內層 class 可以使用 外層所有的 method 與變數，就算 prive 用的也是一樣的。<br>
16.inner class 的實體一定會綁在 outer class 的實體上。<br>
17.inner class 的步驟：<br>
A：建構外層 class 的實體。<br>
B：使用外層 class 的實體來建構內層 class 的實體。<br>
C：外層與內層有著連結。<br>
18.介紹如何建構內層 class 實體。<br>
19.一個外層可以有多個內層，但是一個內層只能有一個外層。<br>
20.有 AB 兩個外層， A 有一個內層，但是 B 沒有內層， B 不可以去使用 A 的內層只有 A 可以使用。<br>
21.動畫效果如何運作的：<br>
A：在特定座標繪製物件。<br>
B：在不同座標重新繪製物件。<br>
C：於座標尚未到達終點前重複上列步驟。<br>
22.傾聽非 GUI 的事件 例如：MIDI。<br>
23.每個事件都要有的動作：<br>
A：建構訊息實體。<br>
B：呼叫 setMessage()。<br>
C：製作訊息的 MidIEvent 實體。<br>
D：把事件加入 track 上。<br>
24.範例：如何使用靜態的 makeEvent()。<br>
25.實作全部範例。<br>

# 第十三章 - 運用 Swing
1.元件與容器的介紹。<br>
2.Swing 的組件有像是 Text Field、Button等等。事實上所有的元件都是 extend 自 javax.swing.JComponent。<br>
3.組件是可以套疊的。<br>
4.建構 GUI 四個步驟：<br>
A：建構 window(JFrame)<br>
B：建構組件<br>
C：把組件加到 Frame 上<br>
D：顯示出來<br>
5.布局管理員(layout manager) 用來控制所關聯組件上所攜帶的其他組件。<br>
6.layout manager 有幾種不同的類型，每個背景組件都可以有自訂規則的 layout manager。<br>
7.layout manager 是如何做決定的?布局的情境：<br>
A：製作 Panel 並加上三個 Button。<br>
B：Panel 的 layout manager 會詢問每個元件理想的大小應該是甚麼。<br>
C：Panel 的 layout manager 以他的布局策略來決定是否應該尊重全部或者部分的 Button 理想。<br>
D：把 Panel 加入 Frame 上。<br>
E：Frame 的 layout Manager 詢問 Panel 的理想尺寸。<br>
F：Frame 的 layout Manager 以他的布局策略來決定是否應該尊重全部或者部分的 Panel 理想。<br>
8.不同的 layout Manager 有不同的布局策略。<br>
9.世界三大首席管理員：Borde、Flow 與 Box。<br>
10.BorderLayout 管理五個區域：East、West、North、South、Center。<br>
11.FlowLayout 管理組建的流向：依序從左至右、從上而下。<br>
12.BoxLayout 就算他夠寬，他還是會垂直排列不會水平排列。<br>
13.FlowLayout 為水平排列，BoxLayout 為垂直排列，兩者可以搭配使用。<br>
14.操作 Swing 組件，JTextField 如何使用：<br>
A：取得欄位內容。<br>
B：設定內容。<br>
C：取得使用者輸入完畢按下 return 或 enter 鍵的事件。<br>
D：選取文字欄位的內容。<br>
E：把 GUI 目前焦點拉回到文字欄位以便讓使用者進行輸入動作。<br>
15.操作 Swing 組件，JTextArea 和 ScrollPane 如何使用：<br>
A：只有垂直的捲軸。<br>
B：替換掉文字內容。<br>
C：加入文字。<br>
D：選取內容<br>
E：把 GUI 目前焦點拉回到文字欄位以便讓使用者進行輸入動作。<br>
16.操作 Swing 組件，JCheckBox 如何使用：<br>
A：傾聽 item 的事件(被選取或者變成非選取)。<br>
B：處理事件(判別是否被選取)。<br>
C：用程式來選取或除去選取。<br>
17.操作 Swing 組件，JList 如何使用：<br>
A：讓它顯示垂直的捲軸。<br>
B：設定顯示的行數。<br>
C：限制使用者只能選取一個項目。<br>
D：對選擇事件作登記。<br>
E：處理事件(判別選了哪個項目)。<br>
18.製作練習題 BeatBox。<br>

# 第十四章 - 保存物件
1.物件可以被攤平也可以展開。<br>
2.如果只有自己寫的 Java 城市會用到這些資料：加以序列化(Serialization)。<br>
3.如果資料需要被其他程式引用：以其他程式可以解析的特殊字元分隔格式寫到檔案中。<br>
4.儲存狀況的兩種辦法：<br>
A：把物件寫入檔案中(例如：有精靈、矮人、魔法師三種人物物件)。<br>
B：寫入純文字檔。<br>
5.將序列化物件寫入檔案的步驟：<br>
A：建構出 FileOutPutSteram 。<br>
B：製作 ObjectOutputStreem 。<br>
C：寫入物件。<br>
D：關閉 ObjectOutputStreem 。<br>
6.介紹資料如何變成檔案的過程。<br>
7.當物件被序列化時，該物件的實體變數也會被序列化。且所有被參考的物件也會被序列化，這些動作都是自動執行的。<br>
8.序列化程序會把物件版圖上的所有東西儲存起來。被物件的實體變數所參考的鎖又物件也都會被序列化。<br>
9.如果要讓 Class 能夠被序列化就必須實作 Serializable。<br>
10.整個物件版圖必須都正確的序列化，不然其中一個失敗全部失敗。例如 Duck 物件不能被序列化，那 Pond 物件也就不能被序列化。<br>
11.如果某實體變數不能或不應該被序列化，就把它標示為 transient (暫態)的。<br>
12.Deserialization 還原物件的步驟：<br>
A：建構出 FileInputSteram 。<br>
B：製作 ObjectInputStreem 。<br>
C：讀取物件。<br>
D：轉換物件型別。<br>
E：關閉 ObjectInputStreem 。<br>
13.解序列化的步驟：<br>
A：物件從 Stream 中讀出來。<br>
B：JVM 透過儲存的資訊判別出物件的 class 型別。<br>
C：JVM 嘗試尋找與載入物件的 class。如果 JVM 找不到或無法載入該 class ，則 JVM 會拋出例外。<br>
D：新的物件會被配置在 heap 上，但 constructor 不會執行!很明顯的，這樣會把物件的狀態抹去又變成全新的，而這不是我們想要的結果。我們需要物件回到儲存時點的狀態。<br>
E：如果物件在繼承樹上有個不可序列化的祖先 class，則該不可序列化 class 以及在他之上的 class 的 constructor (就算是可序列化也一樣)就會執行。一但 constructor 連鎖啟動之後將無法停止。也就是說從第一個不可序列化的 superclass 開始，全部都會重心初始狀態。<br>
F：物件的實體變數會被還原成序列化時點的狀態值。transient 變數會被指派 null 的物件參考或者 primitive 的預設 0、false 值。<br>
14.將字串寫入文字檔。<br>
15.可以對 File 物件做的事情：<br>
A：建構出代表縣存檔案的 File 物件。<br>
B：建立新的目錄。<br>
C：列出目錄下的內容。<br>
D：取得檔案或目錄的絕對路徑。<br>
E：刪除目錄或檔案(成功會回傳true)。<br>
16.緩衝區的介紹。<br>
17.讀取文字檔。<br>
18.解析字串使用 String 的 split() 解析。<br>
19.使用 Version ID：序列化的識別的步驟與介紹：<br>
A：使用 Serialver 工具來取得版本 ID。<br>
B：把輸出拷貝到 class 上。<br>
C：在修改 class 的時候要確定修改程式的後果!例如說新的 Dog 要能夠處理舊的 Dog 解序列化之後新加入變數的預設值。<br>
