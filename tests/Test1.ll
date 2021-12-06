declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
declare void @memset(i32*, i32, i32)
declare i32 @getarray(i32*)
declare void @putarray(i32, i32*)
@d = dso_local global i32 3
define dso_local i32 @add  (  i32 %t1 ,  i32 %t2 ){
   %l1 = alloca i32
   %l2 = alloca i32
   store i32 %t1 , i32* %l1
   store i32 %t2 , i32* %l2
   store i32 10, i32* @d
   %t3 = load i32 , i32* %l1
   %t4 = load i32 , i32* %l2
   %t5 = add i32 %t3 , %t4
   ret i32 %t5
   ret i32 0
}
define dso_local i32 @main ( ){
