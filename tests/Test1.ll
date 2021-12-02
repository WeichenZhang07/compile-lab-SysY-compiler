declare i32 @getint()
declare void @putint(i32)
declare void @putch(i32)
declare i32 @getch()
declare void @memset(i32*, i32, i32)
@__HELLO = dso_local global [ 100 x i32 ] zeroinitializer, align 16
@N4__mE___ = dso_local global [ 300 x i32 ] zeroinitializer, align 16
@saY_HeI10_To = dso_local global [ 40 x i32 ] zeroinitializer, align 16
@RET = dso_local global [ 5 x i32 ] zeroinitializer, align 16
define dso_local i32 @main () {
%l1 = alloca i32
%l2 = alloca i32
%l3 = alloca i32
%l4 = alloca i32
%t1 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 0
%t2 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 0
store i32 87 , i32* %t2
%t3 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 1
store i32 101 , i32* %t3
%t4 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 2
store i32 108 , i32* %t4
%t5 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 3
store i32 99 , i32* %t5
%t6 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 4
store i32 111 , i32* %t6
%t7 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 5
store i32 109 , i32* %t7
%t8 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 6
store i32 101 , i32* %t8
%t9 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 7
store i32 32 , i32* %t9
%t10 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 8
store i32 116 , i32* %t10
%t11 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 9
store i32 111 , i32* %t11
%t12 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 10
store i32 32 , i32* %t12
%t13 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 11
store i32 116 , i32* %t13
%t14 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 12
store i32 104 , i32* %t14
%t15 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 13
store i32 101 , i32* %t15
%t16 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 14
store i32 32 , i32* %t16
%t17 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 15
store i32 74 , i32* %t17
%t18 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 16
store i32 97 , i32* %t18
%t19 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 17
store i32 112 , i32* %t19
%t20 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 18
store i32 97 , i32* %t20
%t21 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 19
store i32 114 , i32* %t21
%t22 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 20
store i32 105 , i32* %t22
%t23 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 21
store i32 32 , i32* %t23
%t24 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 22
store i32 80 , i32* %t24
%t25 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 23
store i32 97 , i32* %t25
%t26 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 24
store i32 114 , i32* %t26
%t27 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 25
store i32 107 , i32* %t27
%t28 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 26
store i32 33 , i32* %t28
%t29 = getelementptr [100 x i32], [100 x i32]* @__HELLO , i32 0, i32 27
store i32 10 , i32* %t29
%t30 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 0
%t31 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 0
store i32 83 , i32* %t31
%t32 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 1
store i32 97 , i32* %t32
%t33 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 2
store i32 97 , i32* %t33
%t34 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 3
store i32 98 , i32* %t34
%t35 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 4
store i32 97 , i32* %t35
%t36 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 5
store i32 114 , i32* %t36
%t37 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 6
store i32 117 , i32* %t37
%t38 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 50
store i32 75 , i32* %t38
%t39 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 51
store i32 97 , i32* %t39
%t40 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 52
store i32 98 , i32* %t40
%t41 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 53
store i32 97 , i32* %t41
%t42 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 54
store i32 110 , i32* %t42
%t43 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 100
store i32 72 , i32* %t43
%t44 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 101
store i32 97 , i32* %t44
%t45 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 102
store i32 115 , i32* %t45
%t46 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 103
store i32 104 , i32* %t46
%t47 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 104
store i32 105 , i32* %t47
%t48 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 105
store i32 98 , i32* %t48
%t49 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 106
store i32 105 , i32* %t49
%t50 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 107
store i32 114 , i32* %t50
%t51 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 108
store i32 111 , i32* %t51
%t52 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 109
store i32 107 , i32* %t52
%t53 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 110
store i32 111 , i32* %t53
%t54 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 111
store i32 117 , i32* %t54
%t55 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 150
store i32 65 , i32* %t55
%t56 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 151
store i32 114 , i32* %t56
%t57 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 152
store i32 97 , i32* %t57
%t58 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 153
store i32 105 , i32* %t58
%t59 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 154
store i32 103 , i32* %t59
%t60 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 155
store i32 117 , i32* %t60
%t61 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 156
store i32 109 , i32* %t61
%t62 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 157
store i32 97 , i32* %t62
%t63 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 200
store i32 72 , i32* %t63
%t64 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 201
store i32 117 , i32* %t64
%t65 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 202
store i32 110 , i32* %t65
%t66 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 203
store i32 98 , i32* %t66
%t67 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 204
store i32 111 , i32* %t67
%t68 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 205
store i32 114 , i32* %t68
%t69 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 206
store i32 117 , i32* %t69
%t70 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 207
store i32 116 , i32* %t70
%t71 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 208
store i32 111 , i32* %t71
%t72 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 209
store i32 32 , i32* %t72
%t73 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 210
store i32 80 , i32* %t73
%t74 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 211
store i32 101 , i32* %t74
%t75 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 212
store i32 110 , i32* %t75
%t76 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 213
store i32 103 , i32* %t76
%t77 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 214
store i32 105 , i32* %t77
%t78 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 215
store i32 110 , i32* %t78
%t79 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 250
store i32 84 , i32* %t79
%t80 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 251
store i32 97 , i32* %t80
%t81 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 252
store i32 105 , i32* %t81
%t82 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 253
store i32 114 , i32* %t82
%t83 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 254
store i32 105 , i32* %t83
%t84 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 255
store i32 107 , i32* %t84
%t85 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 256
store i32 117 , i32* %t85
%t86 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 257
store i32 32 , i32* %t86
%t87 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 258
store i32 79 , i32* %t87
%t88 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 259
store i32 111 , i32* %t88
%t89 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 260
store i32 107 , i32* %t89
%t90 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 261
store i32 97 , i32* %t90
%t91 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 262
store i32 109 , i32* %t91
%t92 = getelementptr [300 x i32], [300 x i32]* @N4__mE___ , i32 0, i32 263
store i32 105 , i32* %t92
%t93 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 0
%t94 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 0
store i32 32 , i32* %t94
%t95 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 1
store i32 115 , i32* %t95
%t96 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 2
store i32 97 , i32* %t96
%t97 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 3
store i32 121 , i32* %t97
%t98 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 4
store i32 115 , i32* %t98
%t99 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 5
store i32 32 , i32* %t99
%t100 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 6
store i32 104 , i32* %t100
%t101 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 7
store i32 101 , i32* %t101
%t102 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 8
store i32 108 , i32* %t102
%t103 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 9
store i32 108 , i32* %t103
%t104 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 10
store i32 111 , i32* %t104
%t105 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 11
store i32 32 , i32* %t105
%t106 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 12
store i32 116 , i32* %t106
%t107 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 13
store i32 111 , i32* %t107
%t108 = getelementptr [40 x i32], [40 x i32]* @saY_HeI10_To , i32 0, i32 14
store i32 32 , i32* %t108
%t109 = getelementptr [5 x i32], [5 x i32]* @RET , i32 0, i32 0
%t110 = getelementptr [5 x i32], [5 x i32]* @RET , i32 0, i32 0
store i32 10 , i32* %t110
store i32 0, i32* %l1
br label %b1
b1:
%t111 = load i32, i32* %l1
%t113 = mul nsw i32 1 , %t111
%t114 = add i32 %t113 , 0
%t112 = getelementptr [ 100 x i32 ], [ 100 x i32 ]* @__HELLO , i32 0, i32 %t114
%t115 = load i32, i32* %t112
%t116 = icmp slt i32 0 , %t115
br i1 %t116, label %b2, label %b3
b2:
%t117 = load i32, i32* %l1
%t119 = mul nsw i32 1 , %t117
%t120 = add i32 %t119 , 0
%t118 = getelementptr [ 100 x i32 ], [ 100 x i32 ]* @__HELLO , i32 0, i32 %t120
%t121 = load i32, i32* %t118
call void @putch( i32 %t121 )
%t122 = load i32, i32* %l1
%t123 = add i32 %t122 , 1
store i32 %t123, i32* %l1
br label %b1
b3:
store i32 0,i32* %l2
br label %b4
b4:
%t124 = icmp slt i32 0 , 1
br i1 %t124, label %b5, label %b6
b5:
%t125 = load i32, i32* %l2
%t126 = sdiv i32 %t125 , 6
store i32 %t126,i32* %l3
%t127 = load i32, i32* %l2
%t128 = srem i32 %t127 , 6
store i32 %t128,i32* %l4
%t129 = load i32, i32* %l3
%t130 = load i32, i32* %l4
%t131 = icmp ne i32 %t129 , %t130
br i1 %t131, label %b7, label %b8
b7:
store i32 0, i32* %l1
br label %b9
b9:
%t132 = load i32, i32* %l3
%t133 = load i32, i32* %l1
%t135 = mul nsw i32 50 , %t132
%t136 = add i32 %t135 , 0
%t137 = mul nsw i32 1 , %t133
%t138 = add i32 %t137 , %t136
%t134 = getelementptr [ 300 x i32 ], [ 300 x i32 ]* @N4__mE___ , i32 0, i32 %t138
%t139 = load i32, i32* %t134
%t140 = icmp slt i32 0 , %t139
br i1 %t140, label %b10, label %b11
b10:
%t141 = load i32, i32* %l3
%t142 = load i32, i32* %l1
%t144 = mul nsw i32 50 , %t141
%t145 = add i32 %t144 , 0
%t146 = mul nsw i32 1 , %t142
%t147 = add i32 %t146 , %t145
%t143 = getelementptr [ 300 x i32 ], [ 300 x i32 ]* @N4__mE___ , i32 0, i32 %t147
%t148 = load i32, i32* %t143
call void @putch( i32 %t148 )
%t149 = load i32, i32* %l1
%t150 = add i32 %t149 , 1
store i32 %t150, i32* %l1
br label %b9
b11:
store i32 0, i32* %l1
br label %b12
b12:
%t151 = load i32, i32* %l1
%t153 = mul nsw i32 1 , %t151
%t154 = add i32 %t153 , 0
%t152 = getelementptr [ 40 x i32 ], [ 40 x i32 ]* @saY_HeI10_To , i32 0, i32 %t154
%t155 = load i32, i32* %t152
%t156 = icmp slt i32 0 , %t155
br i1 %t156, label %b13, label %b14
b13:
%t157 = load i32, i32* %l1
%t159 = mul nsw i32 1 , %t157
%t160 = add i32 %t159 , 0
%t158 = getelementptr [ 40 x i32 ], [ 40 x i32 ]* @saY_HeI10_To , i32 0, i32 %t160
%t161 = load i32, i32* %t158
call void @putch( i32 %t161 )
%t162 = load i32, i32* %l1
%t163 = add i32 %t162 , 1
store i32 %t163, i32* %l1
br label %b12
b14:
store i32 0, i32* %l1
br label %b15
b15:
%t164 = load i32, i32* %l4
%t165 = load i32, i32* %l1
%t167 = mul nsw i32 50 , %t164
%t168 = add i32 %t167 , 0
%t169 = mul nsw i32 1 , %t165
%t170 = add i32 %t169 , %t168
%t166 = getelementptr [ 300 x i32 ], [ 300 x i32 ]* @N4__mE___ , i32 0, i32 %t170
%t171 = load i32, i32* %t166
%t172 = icmp slt i32 0 , %t171
br i1 %t172, label %b16, label %b17
b16:
%t173 = load i32, i32* %l4
%t174 = load i32, i32* %l1
%t176 = mul nsw i32 50 , %t173
%t177 = add i32 %t176 , 0
%t178 = mul nsw i32 1 , %t174
%t179 = add i32 %t178 , %t177
%t175 = getelementptr [ 300 x i32 ], [ 300 x i32 ]* @N4__mE___ , i32 0, i32 %t179
%t180 = load i32, i32* %t175
call void @putch( i32 %t180 )
%t181 = load i32, i32* %l1
%t182 = add i32 %t181 , 1
store i32 %t182, i32* %l1
br label %b15
b17:
store i32 0, i32* %l1
br label %b18
b18:
%t183 = load i32, i32* %l1
%t185 = mul nsw i32 1 , %t183
%t186 = add i32 %t185 , 0
%t184 = getelementptr [ 5 x i32 ], [ 5 x i32 ]* @RET , i32 0, i32 %t186
%t187 = load i32, i32* %t184
%t188 = icmp slt i32 0 , %t187
br i1 %t188, label %b19, label %b20
b19:
%t189 = load i32, i32* %l1
%t191 = mul nsw i32 1 , %t189
%t192 = add i32 %t191 , 0
%t190 = getelementptr [ 5 x i32 ], [ 5 x i32 ]* @RET , i32 0, i32 %t192
%t193 = load i32, i32* %t190
call void @putch( i32 %t193 )
%t194 = load i32, i32* %l1
%t195 = add i32 %t194 , 1
store i32 %t195, i32* %l1
br label %b18
b20:
br label %b8
b8:
%t196 = load i32, i32* %l2
%t197 = mul nsw i32 %t196 , 17
%t198 = add i32 %t197 , 23
%t199 = srem i32 %t198 , 32
store i32 %t199, i32* %l2
%t200 = load i32, i32* %l2
%t201 = icmp eq i32 %t200 , 0
br i1 %t201, label %b21, label %b22
b21:
br label %b6
br label %b22
b22:
br label %b4
b6:
ret i32 0
}

