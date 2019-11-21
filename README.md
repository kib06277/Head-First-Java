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
