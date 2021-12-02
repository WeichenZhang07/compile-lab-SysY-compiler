declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
declare void @memset(i32*, i32, i32)
@arr = common global [ 4 x i32 ] zeroinitializer, align 16
define dso_local i32 @main () {
