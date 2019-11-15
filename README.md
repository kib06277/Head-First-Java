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


