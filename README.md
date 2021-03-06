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

# HelloWorld 是全部章節的 code

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

# 第十五章 - 網路連線
1.互動程式概觀：<br>
A：用戶端必須要認識伺服器。<br>
B：伺服器必須要認識所有用戶端。<br>
2.運作方式：<br>
A：用戶端連接到伺服器。<br>
B：伺服器建立連線並把用戶端加到來賓清單中。<br>
C：另外一個用戶連接上來。<br>
D：用戶 A 送出訊息到聊天伺服器上。<br>
E：伺服器將訊息送給所有的來賓。<br>
3.連接、傳送與接收，要讓用戶端能運作必須先學會三件事情：<br>
A：如何建立用戶端與伺服器之間的初始連結。<br>
B：如何傳送訊息到伺服器。<br>
C：如何接受到來自伺服器的訊息。<br>
4.網路互動溝通步驟：<br>
A：Connect - 用戶端藉由建立 Socket 連線來連結伺服器。<br>
B：Send - 用戶送出訊息給伺服器。<br>
C：Receive - 用戶從伺服器接受訊息。<br>
5.建立 Socket 連線 - 要建構 Socket 連線你得知道兩項關於伺服器的資訊：他在哪裡以及用在哪個阜號來收發資料。也就是 IP 位置和 port 號。<br>
6.Socket 連線的建立代表兩台機器之間存有對方的資訊，包括網路位置與 TCP 的 port 號。<br>
7.使用 BufferedReader 從 Socket 上讀取資料的步驟：<br>
A：建立對伺服器的 Socket 連線。<br>
B：建立連結到 Socket 上低階輸出串流的 InputSteramReader。<br>
C：建立 BufferedReader 來讀取。<br>
8.以 PrintWriter 寫資料到 Socket 上。<br>
A：對伺服器建立 Socket 連線。<br>
B：建立連結到 Socket 的 PrintWriter。<br>
C：寫入資料。<br>
9.建立簡單的用戶端步驟： (範例 DailyAdviceClient)<br>
A：連結。<br>
B：讀取。<br>
10.建立簡單的伺服器步驟：(範例 DailyAdviceServer)<br>
A：伺服器應用程式對特定 Port 建構出 ServerSocket ServerSocket serverSock = new ServerSocket(4242);<br>
B：用戶端對伺服器應用程式建構 Socket 連線 Socket Sock = new Socket("190.165.1.103",4242);<br>
C：伺服器建構出與用戶端通訊的新 Socket ，Socket Sock = serverSock.accept();<br>
11.將伺服器變成可以服務多個用戶端會有那些問題和哪些選項?<br>
A - 第一個問題：如何從伺服器取得訊息?<br>
B - 第二個問題：何時會從伺服器取得訊息?<br>
A - 解決辦法選項：<br>
a.選項一：每隔二十秒查詢一次伺服器。<br>
b.選項二：每當使用者送出訊息時就順便從伺服器讀取訊息。<br>
c.選項三：當訊息被送到伺服器上的時候就把他讀回來。 (設計模式 - 觀察者模式)<br>
12.執行序和 Thread 的介紹。<br>
13.Java 有多個 thread 但是只能有一種 Thread。<br>
14.thread 是獨立的執行序。他代表獨立的執行空間。<br>
15.Thread 是 Java 中用來表示執行序的 class。<br>
16.要建立執行序就得建構 Thread。<br>
17.thread 執行的步驟：<br>
A：JVM 呼叫 main()。<br>
B：main() 啟動新的 thread。新的 thread 啟動期間，main 的 thread 會暫時的凍結。<br>
C：JVM 會在 thread 與原本的 main 執行序之間切換直到兩者都完成為止。<br>
18.如何啟動新的執行序：<br>
A：建構 Runnable 物件(thread 的任務)。<br>
B：建構 Thread 物件 (執行工人)並指派 Runnable (任務)。<br>
C：啟動 Thread。<br>
19.每個 Thread 需要一個任務來執行，一個可以放在執行空間的任務。<br>
20.對 Thread 而言，他就是工人，而Runnable 就是工人的工作。Runnable 帶有會放在執行空間的第一項 method:run();<br>
21.一旦執行序進入可執行狀態，他會在可執行與執行中兩種狀態來來去去，同時也會有另外一種狀態：暫時不可執行(又稱為被 blocked 狀態)。<br>
22.當 thread 遇到閒置、等待其他 thread 完成、等待串流的資料、等待被占用的物件等等等都會被變成 blocked 狀態。<br>
23.建構與啟動兩個 thread。<br>
24.thread 發生碰撞的問題與解決辦法。<br>
25.每個 Java 物件都有一把鎖。每個鎖只有一把鑰匙。通常物件都沒有上鎖也沒有人在乎這件事情，但是如果物件有同步化的 method，則 thread 只能再取得鑰匙的情況下進入 thread。也就是說並沒有其他 thread 已經進入的情況下才能進入。<br>
26.thread 的同步化問題，以同步機制讓 increment() 原子化。<br>
27.同步化的死結。<br>

# 第十六章 - 資料結構
1.排序。<br>
2.ArrayList API。<br>
3.ArrayList 不是唯一的集合。<br>
4.其他相關的集合：<br>
A：TreeSet。<br>
B：HashMap。<br>
C：LinkedList。<br>
D：HashSet。<br>
E：LinkedHashMap。<br>
5.可以使用 Treeset 或者 Collection.sort()。<br>
6.儲存自訂物件-要使用物件而不只是 String 例如自訂 Song 物件。<br>
7.泛行意味著更好的型別安全性。<br>
8.運用 generic 你就可以建構型別更好的集合，讓問題盡可能在編譯期間就可以抓到，而不會等到執行期才出現。<br>
9.如果沒有 generic ，編輯議會很快就你物件送到錯誤的集合中。例如綿羊物件放到老虎集合中。<br>
10.關於 generic ：<br>
A：建構被泛型化 class (例如 ArrayList) 的實體。<br>
B：宣告與指定 generic 型別的變數。<br>
C：宣告(與呼叫)取用 generic 型別的 method。<br>
11.使用泛型的 class。<br>
12.Arraylist 的說明文件(又稱"E是甚麼?")，把 E 想做是 "集合所要維護與回傳的元素型(E 代表 Element)"<br>
13.E 代表用來建構與初始 ArrayList 的型別。<br>
14.運用泛型的 method：<br>
A：使用定義在 class 宣告的型別參數。<br>
B：使用未定義在 class 宣告的型別參數。<br>
15.以泛型的觀點來說，extend 代表 extend 或者 implement。<br>
16.使用自製的 Comparator。<br>
17.Collection 的 API 說明吳建忠有三個主要的 interface：List、Set、Map。<br>
A：List - 對付順序用的。<br>
B：Set - 注重獨一無二的。<br>
C：Map - 用 key 來搜尋的。<br>
18.以 HashSet 取代 ArrayList。<br>
19.物件的比對。<br>
20.HashSet 如何檢查重複：hashCode() 與 equals()。<br>
21.TreeSets 與排序。<br>
22.使用 TreeSet 的元素必須是 Comparable 並且以下兩點必須一點為真：<br>
A：集合中的元素必須是有實作過 Comparable 的型別。<br>
B：使用過 overload 過或是取用 Comparator 參數的 constructor 來建構 TreeSet。<br>
23.介紹 Map。<br>
24.陣列與 ArrayLists 的差別。<br>
25.陣列的型別是在執行期檢查的，但是集合的型別檢查只會發生在編譯期。<br>
26.萬用字元例如： ? extend Animal。<br>

# 第十七章 - 發布程式
1.部署 Java 應用程式。<br>
2.部署的選擇：<br>
A：本機 - 完全在本機。<br>
B：兩者之間的組合 - Web Start 和 RMI APP。<br>
C：遠端 - Http Servlets。<br>
3.Java 程式是由一群 class 組成。那就是開發過程的輸出。<br>
4.將原始碼與 class 檔案分離，編輯時加上 -d (directory)旗標。<br>
5.把程式包進 JAR。<br>
6.建構可執行的JAR：<br>
A：確定所有的 class 檔案都在 classes 目錄下。<br>
B：建立 manifest.txt 來描述哪個 class 帶有 main();<br>
C：執行 jar 工具來建構帶有所有 class 以及 manifest 的 Jar 檔案。<br>
7.大部分完全在本機的 Java 應用程式都是以可執行的 JAR 來部署的。<br>
8.把 class 包進 package 中。<br>
9.用 package 防止 class 名稱衝突。<br>
10.package 可以預防名稱衝突，但是這只會在 package 名稱保證不會重複的情況下作用。最好的方式是在前面加上反過來的 domain 名稱。<br>
11.把 Class 包進 package 中：<br>
A：選擇 package 名稱。<br>
B：在 class 中 加入 package 指令。<br>
C：設定相對應的目錄結構。<br>
12.必須把 class 放在與 package 階層結構相對應的目錄結構下。<br>
13.編輯與執行 package，加上 -d(directory) 旗標來編輯。<br>
14.-d 旗標會要求編輯器將編輯結果根據 package 的結構來建立目錄與輸出，如果目錄還沒有建好，編輯器會自動處理。<br>
15.以 package 建構可執行的 JAR。<br>
16.以 package 建構可執行的JAR：<br>
A：確定所有的 class 檔案都在 classes 目錄下正確相對應的 package 結構中。<br>
B：建立 manifest.txt 來描述哪個 class 帶有 main();<br>
C：執行 jar 工具來建構帶有所有 class 以及 manifest 的 Jar 檔案。<br>
17.Java Web Start 的介紹。<br>
18.使用者透過點選網頁上某個連結來啟動 Java Web Start 的應用程式。一旦程式下載後，他就能獨立於瀏覽器之外來執行。事實上，Java Web Start 應用程式只不過是<br>
透過網路來散佈的應用程式而已。<br>
19.Java Web Start 的運作方式<br>
A：用戶端點選某個網頁上的 JWS 應用程式的 link(.jnlp 檔)。<br>
B：網頁伺服器收到 request 送出的 .jnlp 檔案(不是 JAR)給用戶端的瀏覽器。<br>
C：瀏覽器啟動 Java Web Start，JWS 的 helper app 讀取 .jnlp 檔案，然後向伺服器要求 MyApp.jar。<br>
D：網頁伺服器送出 .jar 檔案<br>
E：JWS 取得 JAR 並呼叫指定 main() 來啟動應用程式。<br>
20.建構與部屬 Java Web Start 的步驟：<br>
A：將程式製作成可執行的 JAR。<br>
B：撰寫 .jnlp 檔案。<br>
C：.jnlp 與 JAR 檔案放到網站上。<br>
D：對網頁伺服器設定新的 mime 類型 application/x-java-jnlp-file。<br>
E：設定網頁連結到 .jnlp 檔案。<br>

# 第十八章 - 分散式運算
一、距離不是問題，介紹 Java 的遠端程序 RMI (Remote Method Invocation，RMI) 技術。 <br>
二、method 的呼叫都是發生在相同的 heap 上的兩個物件之間。<br>
三、遠端程序呼叫的設計要建構出四樣東西：伺服器、用戶端、伺服器輔助設施、用戶端輔助設施。<br>
四、建構用戶端與伺服器應用程式 - 伺服器應用程式是個遠端服務，是個帶有用乎戶端會要呼叫 nethod 的物件。<br>
五、建構用戶端與伺服器端的輔助設施(helper) - 他們會處理所有用戶端與伺服器的低階網路輸出入細節，讓你用戶端好像在處理本機呼叫一樣。<br>
六、helper 的任務 - helper 偽裝成服務溝通伺服器端和用戶端，用戶端 (呼叫) <-> helper (呼叫) <-> 伺服器端。<br>
七、用戶端物件看起來像是在呼叫遠端的 method。但是實際上他是在呼叫本地處理 Socket 與串流細節的 "Proxy"。<br>
八、呼叫 method 的過程：<br>
	1.用戶端物件對 helper 物件呼叫 doBigThing()。<br>
	2.用戶端 helper 把呼叫資訊打包穿越網路送到伺服器的 helper。<br>
	3.服務端的 helper 解開來自用戶端的 helper 資訊，並以此呼叫真正的服務。<br>
九、Java RMI 提供用戶端與伺服器端的 helper 物件。<br>
十、在 RMI 中，用戶端的 helper 稱為 stub ，而伺服器端的 helper 稱為 skeleton。<br>
十一、建構遠端服務：<br>
	1.建構 Remote interface<br>
		A.Extend 過 java.rmi.Remote。<br>
		B.宣告所有的 method 都會拋出 RemoteException。<br>
		C.確定參數與回傳值都是 primitive 或 Serializable。<br>
	2.實作 Remote。<br>
		A.實作 Remote 這個 interface。<br>
		B.extend 過 UnicastRemoteObject。<br>
		C.撰寫宣告 RemoteException 的無參數 constructor。<br>
		D.向 RMI registry 登記服務。<br>
	3.以 rmic 產生 stub 與 skeletion。<br>
		A.對實作出的 class(非 interface)執行 rmic。<br>
	4.啟動 RMI registry(rmiregistry)。<br>
		A.叫出命令列來啟動 rmiregistry。<br>
	5.啟動遠端服務<br>
		A.叫出另外一個命令列來啟動服務。<br>
十二、用戶端如何取得 stub 物件：<br>
	1.用戶端查詢 RMI registru。<br>
	2.RMI registry 傳回 stub 物件。<br>
	3.用戶端就像取用真正的服務一樣的呼叫 sub 上的 method。<br>
十三、確定每台機器都有所需的 class 檔案。<br>
十四、使用 RMI 時程式設計師經常犯的錯誤：<br>
	1.忘記在啟動遠端服務前燈啟動 rmiregistry(使用 Naming.rebind() 登記服務前 rmiregistry 必須啟動)。<br>
	2.忘記把參數與回傳型別做成可序列化(編輯器不會偵測到，執行時才會發現錯誤)。<br>
	3.忘記將 stub 的 class 交給用戶端。<br>
十五、關於 servlet ：<br>
	1.使用者填寫網頁上的表格並 sumbit。Http 伺服器收到 request 判斷出是要給 servlet 的，就將 request 傳送過去。<br>
	2.servlet 開始執行，把資料存進資料庫，然後組合出傳回給瀏覽器的網頁。<br>
十六、建構與執行 servlet 的步驟：<br>
	1.找出可以放 servlet 的地方。<br>
	2.取得 servlet.jar 並加到 classpath 上。<br>
	3.經由 extend 過 HttpServlet 來撰寫 servlet 的 class。<br>
	4.撰寫 HTML 來呼叫 servlet。<br>
	5.設定 HTML 網頁與 servlet 給伺服器。<br>
十七、EJB 伺服器九一堆你光靠 RMI 不會有的服務，像是交易管理、安全性、處理能量、資料庫、網路功能等。EJB 伺服器作用於 RMI 呼叫與服務之間。<br>
十八、介紹 Jini：<br>
	1.Jini 查詢服務在網路上啟動，並使用 IP multicast 為自己宣傳。<br>
	2.已經啟動的另一個 Jini 服務會尋求像剛剛啟動的查詢服務登記。他登記的是功能而不是名稱，也就是實作的 interface，然後送出序列化物件給查詢服務。<br>
	3.網路用戶端想要取得有時做 ScientificCalculator 的東西，可是不知道哪裡有，所以詢問查詢服務。<br>
	4.查詢服務回應查詢結果。<br>
十九、自療網路的運作：<br>
	1.某個 Jini 服務要求登記，查詢服務回給一份租約。新登記的服務必須要定期更新租約，不然查詢服務會假設此服務已經離線。查詢服務會完整提供可用服務網路狀態。<br>
	2.因為關機所以服務離線，因此也沒有更新租約，查詢服務就把他踢掉。<br>
二十、通用服務瀏覽器的運作方式：<br>
	1.用戶啟動並查詢在 RMI registry 上登記為 ServiceServer 的服務然後取回 stub。<br>
	2.用戶端對 stub 呼叫 getServiceList()。他會回傳服務的陣列。<br>
	3.用戶端以 GUI 展示出服務物的清單。<br>
	4.使用者從清單點選，因此用戶端呼叫 getService() 取得實際服務的序列化物件然後在用戶端的瀏覽器執行。<br>
	5.用戶端呼叫剛剛序列化物件的 getGuiPanel()。此服務的 GUI 會顯示在瀏覽器中，且使用者可與他在本機上互動。這時候就不需要遠端服務囉。<br>
二十一、class 與 interface：<br>
	1.ServiceServer 這個 interface 實作 Remote。<br>
	2.ServiceServerlmpl 這個 class 實作 ServiceServer。<br>
	3.ServiceBrower。<br>
	4.Service。<br>
	5.DiceService 有實作 Service。<br>
	6.有實作 Service 的 MiniMusiceService。<br>
	7.DayOfThWeekService。<br>

★ 架構化參考：深入淺出-設計模式之代理人模式<br>

# 附錄
一、程式料理最終版。<br>
二、十大遺珠之憾：<br>
1.操作位元(~ & | ^ >> >>> <<) 以上各代表的意思。<br>
2.Immutabiluty - 節省記憶體空間。<br>
3.Assertion - Java 5.0 強化的功能。<br>
4.Block Scope 的介紹。<br>
5.Linked Invocations 的介紹。<br>
6.Anonymous 與 static Nested Classes 的介紹。<br>
7.Access Level 與 Access Modifier (誰可以看到甚麼) - 權限介紹(public、protected、default、private)。<br>
8.String 與 StringBuffer/StringBuilder 的 method - Java 5.0 之後的加強 StringBuffer 功能。<br>
9.Multidimesnional Arrays - 多維陣列解析。<br>
10.Enumeration(又稱為 Enumerated 型別或者 Enum) 的介紹。<br>
