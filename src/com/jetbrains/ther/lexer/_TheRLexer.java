/* The following code was generated by JFlex 1.4.3 on 4/27/14 3:52 PM */

/* It's an automatically generated code. Do not modify it. */
package com.jetbrains.ther.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/27/14 3:52 PM from the specification file
 * <tt>./TheR.flex</tt>
 */
class _TheRLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\31\1\27\1\0\1\1\1\7\22\0\1\30\1\75\1\26"+
    "\1\6\1\77\1\61\1\66\1\24\1\100\1\101\1\63\1\16\1\106"+
    "\1\71\1\3\1\62\1\5\7\10\2\10\1\64\1\107\1\70\1\74"+
    "\1\72\1\111\1\65\1\36\3\11\1\15\1\35\2\2\1\41\2\2"+
    "\1\22\1\2\1\40\1\2\1\20\1\2\1\33\1\37\1\32\1\34"+
    "\2\2\1\13\2\2\1\104\1\25\1\105\1\73\1\4\1\110\1\44"+
    "\1\57\1\50\1\11\1\14\1\43\1\46\1\53\1\23\1\2\1\60"+
    "\1\21\1\52\1\42\1\51\1\17\1\2\1\47\1\54\1\45\1\56"+
    "\1\2\1\55\1\12\2\2\1\102\1\67\1\103\1\76\53\0\1\2"+
    "\12\0\1\2\4\0\1\2\5\0\27\2\1\0\7\2\30\2\1\0"+
    "\10\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\2\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\2\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\2\2"+
    "\1\2\1\2\1\2\1\2\3\2\2\2\1\2\1\2\1\2\2\2"+
    "\1\2\3\2\2\2\4\2\1\2\2\2\1\2\3\2\3\2\2\2"+
    "\1\2\2\2\1\2\1\2\1\2\1\2\1\2\2\2\1\2\1\2"+
    "\2\2\1\2\1\2\2\2\1\2\3\2\1\2\1\2\1\2\2\2"+
    "\2\2\1\2\1\2\3\2\4\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\2\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\2\2\1\2\1\2"+
    "\1\2\1\2\1\2\3\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\7\2\2\2\1\2\2\2\2\2\1\2\1\2\4\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\105\2\1\2"+
    "\33\2\22\2\4\0\14\2\16\0\5\2\7\0\1\2\1\0\1\2"+
    "\201\0\1\2\1\2\1\2\1\2\1\2\1\0\1\2\1\2\2\0"+
    "\1\2\3\2\10\0\1\2\1\0\3\2\1\0\1\2\1\0\2\2"+
    "\1\2\21\2\1\0\11\2\43\2\1\2\2\2\3\2\3\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\5\2\1\2\1\2\1\0\1\2\1\2\2\2\2\2"+
    "\63\2\60\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\10\0\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\2\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\2\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\11\0\46\2\2\0\1\2\7\0\47\2\110\0"+
    "\33\2\5\0\3\2\55\0\40\2\1\2\12\2\43\0\2\2\1\0"+
    "\143\2\1\0\1\2\17\0\2\2\7\0\2\2\12\0\3\2\2\0"+
    "\1\2\20\0\1\2\1\0\36\2\35\0\131\2\13\0\1\2\30\0"+
    "\41\2\11\0\2\2\4\0\1\2\5\0\26\2\4\0\1\2\11\0"+
    "\1\2\3\0\1\2\27\0\31\2\253\0\66\2\3\0\1\2\22\0"+
    "\1\2\7\0\12\2\17\0\1\2\6\2\1\0\7\2\5\0\10\2"+
    "\2\0\2\2\2\0\26\2\1\0\7\2\1\0\1\2\3\0\4\2"+
    "\3\0\1\2\20\0\1\2\15\0\2\2\1\0\3\2\16\0\2\2"+
    "\23\0\6\2\4\0\2\2\2\0\26\2\1\0\7\2\1\0\2\2"+
    "\1\0\2\2\1\0\2\2\37\0\4\2\1\0\1\2\23\0\3\2"+
    "\20\0\11\2\1\0\3\2\1\0\26\2\1\0\7\2\1\0\2\2"+
    "\1\0\5\2\3\0\1\2\22\0\1\2\17\0\2\2\43\0\10\2"+
    "\2\0\2\2\2\0\26\2\1\0\7\2\1\0\2\2\1\0\5\2"+
    "\3\0\1\2\36\0\2\2\1\0\3\2\17\0\1\2\21\0\1\2"+
    "\1\0\6\2\3\0\3\2\1\0\4\2\3\0\2\2\1\0\1\2"+
    "\1\0\2\2\3\0\2\2\3\0\3\2\3\0\14\2\26\0\1\2"+
    "\64\0\10\2\1\0\3\2\1\0\27\2\1\0\12\2\1\0\5\2"+
    "\3\0\1\2\32\0\2\2\6\0\2\2\43\0\10\2\1\0\3\2"+
    "\1\0\27\2\1\0\12\2\1\0\5\2\3\0\1\2\40\0\1\2"+
    "\1\0\2\2\17\0\2\2\22\0\10\2\1\0\3\2\1\0\51\2"+
    "\2\0\1\2\20\0\1\2\21\0\2\2\30\0\6\2\5\0\22\2"+
    "\3\0\30\2\1\0\11\2\1\0\1\2\2\0\7\2\72\0\60\2"+
    "\1\0\2\2\14\0\6\2\1\2\72\0\2\2\1\0\1\2\2\0"+
    "\2\2\1\0\1\2\2\0\1\2\6\0\4\2\1\0\7\2\1\0"+
    "\3\2\1\0\1\2\1\0\1\2\2\0\2\2\1\0\4\2\1\0"+
    "\2\2\11\0\1\2\2\0\5\2\1\0\1\2\25\0\2\2\42\0"+
    "\1\2\77\0\10\2\1\0\44\2\33\0\5\2\163\0\53\2\24\0"+
    "\1\2\20\0\6\2\4\0\4\2\3\0\1\2\3\0\2\2\7\0"+
    "\3\2\4\0\15\2\14\0\1\2\21\0\46\2\12\0\53\2\1\0"+
    "\1\2\3\0\u0149\2\1\0\4\2\2\0\7\2\1\0\1\2\1\0"+
    "\4\2\2\0\51\2\1\0\4\2\2\0\41\2\1\0\4\2\2\0"+
    "\7\2\1\0\1\2\1\0\4\2\2\0\17\2\1\0\71\2\1\0"+
    "\4\2\2\0\103\2\45\0\20\2\20\0\125\2\14\0\u026c\2\2\0"+
    "\21\2\1\0\32\2\5\0\113\2\3\0\3\2\17\0\15\2\1\0"+
    "\4\2\16\0\22\2\16\0\22\2\16\0\15\2\1\0\3\2\17\0"+
    "\64\2\43\0\1\2\4\0\1\2\103\0\43\2\1\2\64\2\10\0"+
    "\51\2\1\0\1\2\5\0\106\2\12\0\35\2\63\0\36\2\2\0"+
    "\5\2\13\0\54\2\25\0\7\2\70\0\27\2\11\0\65\2\122\0"+
    "\1\2\135\0\57\2\21\0\7\2\67\0\36\2\15\0\2\2\20\0"+
    "\46\2\32\0\44\2\51\0\3\2\12\0\36\2\6\2\153\0\4\2"+
    "\1\0\4\2\16\0\54\2\66\2\26\2\1\2\42\2\45\2\100\0"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\11\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\11\2\10\2\6\2"+
    "\2\0\6\2\2\0\10\2\10\2\10\2\10\2\6\2\2\0\6\2"+
    "\2\0\10\2\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\10\2\10\2\16\2\2\0\10\2\10\2\10\2\10\2\10\2\10\2"+
    "\5\2\1\0\2\2\4\2\1\2\1\0\1\2\3\0\3\2\1\0"+
    "\2\2\4\2\1\2\3\0\4\2\2\0\2\2\4\2\4\0\10\2"+
    "\5\2\5\0\3\2\1\0\2\2\4\2\1\2\164\0\1\2\15\0"+
    "\1\2\20\0\15\2\145\0\1\2\4\0\1\2\2\0\1\2\3\2"+
    "\2\2\3\2\1\2\1\0\1\2\3\0\5\2\6\0\1\2\1\0"+
    "\1\2\1\0\1\2\1\0\4\2\1\0\1\2\4\2\1\2\4\2"+
    "\1\2\2\0\2\2\2\2\5\0\1\2\4\2\4\0\1\2\21\0"+
    "\43\2\1\2\1\2\4\2\u0a77\0\57\2\1\0\57\2\1\0\1\2"+
    "\1\2\3\2\2\2\1\2\1\2\1\2\1\2\1\2\1\2\4\2"+
    "\1\2\1\2\2\2\1\2\7\2\1\2\3\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\2\2\6\0\1\2\1\2\1\2"+
    "\1\2\21\0\46\2\12\0\66\2\11\0\1\2\20\0\27\2\11\0"+
    "\7\2\1\0\7\2\1\0\7\2\1\0\7\2\1\0\7\2\1\0"+
    "\7\2\1\0\7\2\1\0\7\2\120\0\1\2\u01d5\0\1\2\1\2"+
    "\1\2\31\0\11\2\7\0\5\2\2\0\3\2\1\2\1\2\4\0"+
    "\126\2\6\0\2\2\1\2\1\0\132\2\1\0\3\2\1\2\5\0"+
    "\51\2\3\0\136\2\21\0\33\2\65\0\20\2\u0200\0\u19b6\2\112\0"+
    "\u51cc\2\64\0\25\2\1\2\u0477\2\103\0\50\2\6\2\2\0\u010c\2"+
    "\1\2\3\0\20\2\12\0\2\2\24\0\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\20\0\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\10\0"+
    "\106\2\12\2\47\0\11\2\2\0\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\3\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
    "\1\2\1\2\10\2\1\2\1\2\1\2\1\2\2\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\2\0\1\2"+
    "\1\2\1\2\1\2\1\0\1\2\1\2\16\0\1\2\1\2\1\2"+
    "\1\2\1\2\1\2\1\2\1\2\1\2\1\2\120\0\1\2\7\2"+
    "\1\0\3\2\1\0\4\2\1\0\27\2\35\0\64\2\16\0\62\2"+
    "\76\0\6\2\3\0\1\2\16\0\34\2\12\0\27\2\31\0\35\2"+
    "\7\0\57\2\34\0\1\2\60\0\51\2\27\0\3\2\1\0\10\2"+
    "\24\0\20\2\1\2\6\2\3\0\1\2\5\0\60\2\1\0\1\2"+
    "\3\0\2\2\2\0\5\2\2\0\1\2\1\0\1\2\30\0\2\2"+
    "\1\2\43\0\6\2\2\0\6\2\2\0\6\2\11\0\7\2\1\0"+
    "\7\2\221\0\43\2\35\0\u2ba4\2\14\0\27\2\4\0\61\2\u2104\0"+
    "\u012e\2\2\0\76\2\2\0\152\2\46\0\7\2\14\0\5\2\5\0"+
    "\1\2\1\0\12\2\1\0\15\2\1\0\5\2\1\0\1\2\1\0"+
    "\2\2\1\0\2\2\1\0\154\2\41\0\u016b\2\22\0\100\2\2\0"+
    "\66\2\50\0\14\2\164\0\5\2\1\0\207\2\44\0\32\2\6\0"+
    "\32\2\13\0\12\2\1\2\55\2\2\2\37\2\3\0\6\2\2\0"+
    "\6\2\2\0\6\2\2\0\3\2\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\5"+
    "\1\3\1\7\1\3\2\10\1\11\1\12\1\13\11\3"+
    "\1\1\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\3\1\5\3\0\1\44\1\45\1\3\1\46"+
    "\1\47\1\10\2\0\3\3\1\50\10\3\4\0\1\51"+
    "\2\0\1\52\1\53\1\54\1\0\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\1\65\2\5\1\0"+
    "\5\3\1\66\1\67\1\3\1\70\4\3\1\71\1\72"+
    "\1\0\1\73\1\74\1\75\1\76\1\77\1\100\1\0"+
    "\1\101\1\102\1\3\1\103\3\3\1\104\4\3\1\105"+
    "\1\0\1\106\6\3\1\107\1\110\5\3\1\111\6\3"+
    "\1\112\2\3\1\113\6\3\1\114\1\115\2\3\1\116";

  private static int [] zzUnpackAction() {
    int [] result = new int[171];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\112\0\112\0\224\0\336\0\u0128\0\u0172\0\u01bc"+
    "\0\u0206\0\112\0\u0250\0\u029a\0\u02e4\0\112\0\112\0\112"+
    "\0\u032e\0\u0378\0\u03c2\0\u040c\0\u0456\0\u04a0\0\u04ea\0\u0534"+
    "\0\u057e\0\u05c8\0\112\0\112\0\u0612\0\112\0\u065c\0\u06a6"+
    "\0\u06f0\0\u073a\0\u0784\0\112\0\u07ce\0\u0818\0\112\0\112"+
    "\0\112\0\112\0\112\0\112\0\u0862\0\u08ac\0\112\0\112"+
    "\0\112\0\112\0\u08f6\0\u0940\0\u098a\0\u09d4\0\u0a1e\0\112"+
    "\0\112\0\u0a68\0\224\0\224\0\112\0\u0ab2\0\u0afc\0\u0b46"+
    "\0\u0b90\0\u0bda\0\u0c24\0\u0c6e\0\u0cb8\0\u0d02\0\u0d4c\0\u0d96"+
    "\0\u0de0\0\u0e2a\0\u0e74\0\u0ebe\0\u0f08\0\u0f52\0\u0f9c\0\112"+
    "\0\u0fe6\0\u1030\0\u107a\0\112\0\112\0\u10c4\0\112\0\112"+
    "\0\u110e\0\112\0\112\0\112\0\112\0\112\0\224\0\u1158"+
    "\0\u11a2\0\u11ec\0\u1236\0\u1280\0\u12ca\0\u1314\0\u135e\0\224"+
    "\0\224\0\u13a8\0\224\0\u13f2\0\u143c\0\u1486\0\u14d0\0\112"+
    "\0\112\0\u151a\0\112\0\112\0\112\0\112\0\112\0\112"+
    "\0\u1564\0\224\0\224\0\u15ae\0\224\0\u15f8\0\u1642\0\u168c"+
    "\0\224\0\u16d6\0\u1720\0\u176a\0\u17b4\0\112\0\u17fe\0\224"+
    "\0\u1848\0\u1892\0\u18dc\0\u1926\0\u1970\0\u19ba\0\224\0\224"+
    "\0\u1a04\0\u1a4e\0\u1a98\0\u1ae2\0\u1b2c\0\224\0\u1b76\0\u1bc0"+
    "\0\u1c0a\0\u1c54\0\u1c9e\0\u1ce8\0\224\0\u1d32\0\u1d7c\0\224"+
    "\0\u1dc6\0\u1e10\0\u1e5a\0\u1ea4\0\u1eee\0\u1f38\0\224\0\224"+
    "\0\u1f82\0\u1fcc\0\224";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[171];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\2"+
    "\1\10\3\4\1\11\1\4\1\12\4\4\1\13\1\14"+
    "\1\2\1\15\1\16\1\17\1\20\1\21\2\4\1\22"+
    "\2\4\1\23\1\24\1\25\1\26\3\4\1\27\5\4"+
    "\1\30\1\4\1\31\1\4\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\62\114\0\4\4\2\0"+
    "\6\4\1\0\5\4\6\0\27\4\33\0\1\4\1\63"+
    "\1\4\1\64\2\0\1\64\5\4\1\0\5\4\6\0"+
    "\27\4\34\0\1\64\1\0\1\65\2\0\1\65\1\0"+
    "\2\66\2\67\3\0\2\70\1\71\66\0\7\7\1\0"+
    "\17\7\1\0\62\7\3\0\1\64\1\0\1\10\2\0"+
    "\1\10\3\0\2\67\3\0\2\70\1\71\70\0\4\4"+
    "\2\0\6\4\1\0\2\4\1\72\2\4\6\0\27\4"+
    "\33\0\4\4\2\0\6\4\1\0\5\4\6\0\10\4"+
    "\1\73\1\74\15\4\31\0\24\14\1\75\1\76\64\14"+
    "\25\15\1\77\1\75\63\15\2\0\4\4\2\0\6\4"+
    "\1\0\5\4\6\0\1\4\1\100\25\4\33\0\4\4"+
    "\2\0\6\4\1\0\5\4\6\0\4\4\1\101\22\4"+
    "\33\0\4\4\2\0\6\4\1\0\5\4\6\0\2\4"+
    "\1\102\1\4\1\103\5\4\1\104\14\4\33\0\4\4"+
    "\2\0\6\4\1\0\5\4\6\0\10\4\1\105\16\4"+
    "\33\0\4\4\2\0\4\4\1\106\1\4\1\0\5\4"+
    "\6\0\27\4\33\0\4\4\2\0\6\4\1\0\5\4"+
    "\6\0\17\4\1\107\4\4\1\110\2\4\33\0\4\4"+
    "\2\0\4\4\1\111\1\4\1\0\5\4\6\0\27\4"+
    "\33\0\4\4\2\0\6\4\1\0\5\4\6\0\21\4"+
    "\1\112\5\4\33\0\4\4\2\0\6\4\1\0\5\4"+
    "\6\0\15\4\1\113\11\4\33\0\1\114\6\0\1\114"+
    "\1\115\3\114\1\0\4\114\1\116\6\0\17\114\1\117"+
    "\7\114\1\120\1\121\1\122\112\0\1\123\113\0\1\124"+
    "\112\0\1\125\112\0\1\126\1\127\2\0\1\130\107\0"+
    "\1\131\113\0\1\132\111\0\1\133\111\0\1\134\121\0"+
    "\1\135\112\0\1\136\6\0\1\4\1\137\2\4\2\0"+
    "\6\4\1\0\5\4\6\0\27\4\36\0\1\64\2\0"+
    "\1\64\3\0\2\67\3\0\2\70\1\71\71\0\1\64"+
    "\1\0\1\65\2\0\1\65\3\0\2\67\5\0\1\71"+
    "\73\0\1\140\2\0\2\140\2\0\2\140\17\0\2\140"+
    "\4\0\2\140\3\0\1\140\6\0\1\140\37\0\1\141"+
    "\2\0\1\141\5\0\1\142\52\0\1\142\22\0\4\4"+
    "\2\0\6\4\1\0\5\4\6\0\22\4\1\143\4\4"+
    "\31\0\112\14\112\15\2\0\4\4\2\0\6\4\1\0"+
    "\5\4\6\0\2\4\1\144\24\4\33\0\4\4\2\0"+
    "\6\4\1\0\3\4\1\145\1\4\6\0\27\4\33\0"+
    "\4\4\2\0\6\4\1\0\3\4\1\146\1\4\6\0"+
    "\27\4\33\0\2\4\1\147\1\4\2\0\6\4\1\0"+
    "\5\4\6\0\27\4\33\0\4\4\2\0\6\4\1\0"+
    "\5\4\6\0\6\4\1\150\20\4\33\0\4\4\2\0"+
    "\6\4\1\0\5\4\6\0\11\4\1\151\15\4\33\0"+
    "\4\4\2\0\2\4\1\152\3\4\1\0\5\4\6\0"+
    "\27\4\33\0\4\4\2\0\6\4\1\0\5\4\6\0"+
    "\15\4\1\153\11\4\33\0\4\4\2\0\6\4\1\0"+
    "\5\4\6\0\10\4\1\154\16\4\33\0\4\4\2\0"+
    "\6\4\1\0\1\155\4\4\6\0\27\4\33\0\4\4"+
    "\2\0\6\4\1\0\4\4\1\156\6\0\27\4\33\0"+
    "\4\4\2\0\4\4\1\157\1\4\1\0\5\4\6\0"+
    "\27\4\33\0\1\114\6\0\5\114\1\0\5\114\6\0"+
    "\27\114\1\160\32\0\1\114\6\0\5\114\1\0\5\114"+
    "\6\0\27\114\1\161\32\0\1\114\6\0\5\114\1\0"+
    "\5\114\6\0\10\114\1\162\16\114\1\160\32\0\1\114"+
    "\6\0\5\114\1\0\5\114\6\0\27\114\1\163\111\0"+
    "\1\164\111\0\1\165\114\0\1\166\116\0\1\167\112\0"+
    "\1\170\22\0\1\171\1\0\1\140\2\0\2\140\2\0"+
    "\2\140\1\0\2\67\2\70\12\0\2\140\4\0\2\140"+
    "\3\0\1\140\6\0\1\140\37\0\1\141\2\0\1\141"+
    "\10\0\2\70\1\71\73\0\1\141\2\0\1\141\103\0"+
    "\4\4\2\0\4\4\1\172\1\4\1\0\5\4\6\0"+
    "\27\4\33\0\4\4\2\0\5\4\1\173\1\0\5\4"+
    "\6\0\27\4\33\0\4\4\2\0\6\4\1\0\5\4"+
    "\6\0\5\4\1\174\21\4\33\0\4\4\2\0\6\4"+
    "\1\0\3\4\1\175\1\4\6\0\27\4\33\0\4\4"+
    "\2\0\6\4\1\0\4\4\1\176\6\0\15\4\1\177"+
    "\1\200\10\4\33\0\4\4\2\0\6\4\1\0\5\4"+
    "\6\0\13\4\1\201\13\4\33\0\4\4\2\0\6\4"+
    "\1\0\5\4\6\0\16\4\1\202\10\4\33\0\4\4"+
    "\2\0\4\4\1\203\1\4\1\0\5\4\6\0\27\4"+
    "\33\0\4\4\2\0\6\4\1\0\2\4\1\204\2\4"+
    "\6\0\27\4\33\0\4\4\2\0\6\4\1\0\5\4"+
    "\6\0\12\4\1\205\14\4\33\0\1\114\6\0\5\114"+
    "\1\0\5\114\6\0\27\114\1\206\35\0\1\207\2\0"+
    "\1\207\103\0\4\4\2\0\5\4\1\210\1\0\5\4"+
    "\6\0\27\4\33\0\4\4\2\0\6\4\1\0\5\4"+
    "\6\0\10\4\1\211\16\4\33\0\4\4\2\0\4\4"+
    "\1\212\1\4\1\0\5\4\6\0\27\4\33\0\4\4"+
    "\2\0\6\4\1\0\5\4\6\0\17\4\1\213\1\4"+
    "\1\214\5\4\33\0\4\4\2\0\6\4\1\0\5\4"+
    "\6\0\13\4\1\215\13\4\33\0\4\4\2\0\6\4"+
    "\1\0\5\4\6\0\12\4\1\216\14\4\33\0\4\4"+
    "\2\0\4\4\1\217\1\4\1\0\5\4\6\0\27\4"+
    "\33\0\4\4\2\0\6\4\1\0\5\4\6\0\26\4"+
    "\1\220\36\0\1\207\2\0\1\207\6\0\2\67\73\0"+
    "\4\4\2\0\6\4\1\0\5\4\6\0\13\4\1\221"+
    "\13\4\33\0\4\4\2\0\6\4\1\0\5\4\6\0"+
    "\12\4\1\222\14\4\33\0\4\4\2\0\6\4\1\0"+
    "\5\4\6\0\20\4\1\223\6\4\33\0\4\4\2\0"+
    "\6\4\1\0\5\4\6\0\12\4\1\224\14\4\33\0"+
    "\4\4\2\0\6\4\1\0\4\4\1\225\6\0\27\4"+
    "\33\0\4\4\2\0\6\4\1\0\5\4\6\0\13\4"+
    "\1\226\13\4\33\0\4\4\2\0\4\4\1\227\1\4"+
    "\1\0\5\4\6\0\27\4\33\0\4\4\2\0\6\4"+
    "\1\0\2\4\1\230\2\4\6\0\27\4\33\0\4\4"+
    "\2\0\6\4\1\0\1\231\4\4\6\0\27\4\33\0"+
    "\4\4\2\0\6\4\1\0\5\4\6\0\15\4\1\232"+
    "\11\4\33\0\4\4\2\0\6\4\1\0\5\4\6\0"+
    "\17\4\1\233\7\4\33\0\4\4\2\0\6\4\1\0"+
    "\5\4\6\0\14\4\1\234\12\4\33\0\2\4\1\235"+
    "\1\4\2\0\6\4\1\0\5\4\6\0\27\4\33\0"+
    "\4\4\2\0\6\4\1\0\2\4\1\236\2\4\6\0"+
    "\27\4\33\0\4\4\2\0\6\4\1\0\5\4\6\0"+
    "\12\4\1\237\14\4\33\0\4\4\2\0\6\4\1\0"+
    "\5\4\6\0\10\4\1\240\16\4\33\0\4\4\2\0"+
    "\4\4\1\241\1\4\1\0\5\4\6\0\27\4\33\0"+
    "\4\4\2\0\4\4\1\242\1\4\1\0\5\4\6\0"+
    "\27\4\33\0\4\4\2\0\6\4\1\0\5\4\6\0"+
    "\16\4\1\243\10\4\33\0\4\4\2\0\6\4\1\0"+
    "\5\4\6\0\15\4\1\244\11\4\33\0\4\4\2\0"+
    "\2\4\1\245\3\4\1\0\5\4\6\0\27\4\33\0"+
    "\4\4\2\0\6\4\1\0\5\4\6\0\13\4\1\246"+
    "\13\4\33\0\2\4\1\247\1\4\2\0\6\4\1\0"+
    "\5\4\6\0\27\4\33\0\2\4\1\250\1\4\2\0"+
    "\6\4\1\0\5\4\6\0\27\4\33\0\4\4\2\0"+
    "\4\4\1\251\1\4\1\0\5\4\6\0\27\4\33\0"+
    "\4\4\2\0\6\4\1\0\5\4\6\0\15\4\1\252"+
    "\11\4\33\0\2\4\1\253\1\4\2\0\6\4\1\0"+
    "\5\4\6\0\27\4\31\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8214];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\6\1\1\11\3\1\3\11\12\1\2\11"+
    "\1\1\1\11\5\1\1\11\2\1\6\11\2\1\4\11"+
    "\2\1\3\0\2\11\3\1\1\11\2\0\14\1\4\0"+
    "\1\11\2\0\1\1\2\11\1\0\2\11\1\1\5\11"+
    "\3\1\1\0\15\1\2\11\1\0\6\11\1\0\14\1"+
    "\1\11\1\0\44\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[171];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  _TheRLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _TheRLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 3892) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 41: 
          { return TheRTokenTypes.MODULUS;
          }
        case 79: break;
        case 21: 
          { return TheRTokenTypes.EXP;
          }
        case 80: break;
        case 76: 
          { return TheRTokenTypes.NA_INTEGER_KEYWORD;
          }
        case 81: break;
        case 52: 
          { return TheRTokenTypes.RDBRACKET;
          }
        case 82: break;
        case 32: 
          { return TheRTokenTypes.COMMA;
          }
        case 83: break;
        case 62: 
          { return TheRTokenTypes.TRIPLECOLON;
          }
        case 84: break;
        case 47: 
          { return TheRTokenTypes.RIGHT_ASSIGN;
          }
        case 85: break;
        case 58: 
          { return TheRTokenTypes.KRONECKER_PROD;
          }
        case 86: break;
        case 67: 
          { return TheRTokenTypes.NULL_KEYWORD;
          }
        case 87: break;
        case 6: 
          { return TheRTokenTypes.END_OF_LINE_COMMENT;
          }
        case 88: break;
        case 43: 
          { return TheRTokenTypes.ANDAND;
          }
        case 89: break;
        case 48: 
          { return TheRTokenTypes.GE;
          }
        case 90: break;
        case 3: 
          { return TheRTokenTypes.IDENTIFIER;
          }
        case 91: break;
        case 72: 
          { return TheRTokenTypes.BREAK_KEYWORD;
          }
        case 92: break;
        case 38: 
          { return TheRTokenTypes.IN_KEYWORD;
          }
        case 93: break;
        case 16: 
          { return TheRTokenTypes.AND;
          }
        case 94: break;
        case 65: 
          { return TheRTokenTypes.ELSE_KEYWORD;
          }
        case 95: break;
        case 22: 
          { return TheRTokenTypes.EQ;
          }
        case 96: break;
        case 40: 
          { return TheRTokenTypes.NA_KEYWORD;
          }
        case 97: break;
        case 68: 
          { return TheRTokenTypes.NEXT_KEYWORD;
          }
        case 98: break;
        case 37: 
          { return TheRTokenTypes.COMPLEX_LITERAL;
          }
        case 99: break;
        case 55: 
          { return TheRTokenTypes.INF_KEYWORD;
          }
        case 100: break;
        case 56: 
          { return TheRTokenTypes.FOR_KEYWORD;
          }
        case 101: break;
        case 8: 
          { return TheRTokenTypes.STRING_LITERAL;
          }
        case 102: break;
        case 64: 
          { return TheRTokenTypes.RIGHT_COMPLEX_ASSING;
          }
        case 103: break;
        case 57: 
          { return TheRTokenTypes.INFIX_OP;
          }
        case 104: break;
        case 27: 
          { return TheRTokenTypes.RPAR;
          }
        case 105: break;
        case 11: 
          { return TheRTokenTypes.TAB;
          }
        case 106: break;
        case 59: 
          { return TheRTokenTypes.OUTER_PROD;
          }
        case 107: break;
        case 33: 
          { return TheRTokenTypes.SEMICOLON;
          }
        case 108: break;
        case 71: 
          { return TheRTokenTypes.WHILE_KEYWORD;
          }
        case 109: break;
        case 78: 
          { return TheRTokenTypes.NA_CHARACTER_KEYWORD;
          }
        case 110: break;
        case 24: 
          { return TheRTokenTypes.TILDE;
          }
        case 111: break;
        case 75: 
          { return TheRTokenTypes.FUNCTION_KEYWORD;
          }
        case 112: break;
        case 12: 
          { return TheRTokenTypes.DIV;
          }
        case 113: break;
        case 26: 
          { return TheRTokenTypes.LPAR;
          }
        case 114: break;
        case 18: 
          { return TheRTokenTypes.LT;
          }
        case 115: break;
        case 44: 
          { return TheRTokenTypes.OROR;
          }
        case 116: break;
        case 61: 
          { return TheRTokenTypes.MATRIX_PROD;
          }
        case 117: break;
        case 19: 
          { return TheRTokenTypes.MINUS;
          }
        case 118: break;
        case 50: 
          { return TheRTokenTypes.NOTEQ;
          }
        case 119: break;
        case 4: 
          { return TheRTokenTypes.DOT;
          }
        case 120: break;
        case 36: 
          { return TheRTokenTypes.INTEGER_LITERAL;
          }
        case 121: break;
        case 74: 
          { return TheRTokenTypes.NA_REAL_KEYWORD;
          }
        case 122: break;
        case 60: 
          { return TheRTokenTypes.INT_DIV;
          }
        case 123: break;
        case 53: 
          { return TheRTokenTypes.TRIPLE_DOTS;
          }
        case 124: break;
        case 63: 
          { return TheRTokenTypes.LEFT_COMPLEX_ASSING;
          }
        case 125: break;
        case 54: 
          { return TheRTokenTypes.NAN_KEYWORD;
          }
        case 126: break;
        case 77: 
          { return TheRTokenTypes.NA_COMPLEX_KEYWORD;
          }
        case 127: break;
        case 20: 
          { return TheRTokenTypes.GT;
          }
        case 128: break;
        case 10: 
          { return TheRTokenTypes.SPACE;
          }
        case 129: break;
        case 66: 
          { return TheRTokenTypes.TRUE_KEYWORD;
          }
        case 130: break;
        case 29: 
          { return TheRTokenTypes.RBRACE;
          }
        case 131: break;
        case 31: 
          { return TheRTokenTypes.RBRACKET;
          }
        case 132: break;
        case 69: 
          { return TheRTokenTypes.MATCHING;
          }
        case 133: break;
        case 17: 
          { return TheRTokenTypes.OR;
          }
        case 134: break;
        case 9: 
          { return TheRTokenTypes.LINE_BREAK;
          }
        case 135: break;
        case 73: 
          { return TheRTokenTypes.REPEAT_KEYWORD;
          }
        case 136: break;
        case 13: 
          { return TheRTokenTypes.MULT;
          }
        case 137: break;
        case 51: 
          { return TheRTokenTypes.LDBRACKET;
          }
        case 138: break;
        case 45: 
          { return TheRTokenTypes.LEFT_ASSIGN;
          }
        case 139: break;
        case 14: 
          { return TheRTokenTypes.COLON;
          }
        case 140: break;
        case 7: 
          { return TheRTokenTypes.PLUS;
          }
        case 141: break;
        case 42: 
          { return TheRTokenTypes.DOUBLECOLON;
          }
        case 142: break;
        case 23: 
          { return TheRTokenTypes.NOT;
          }
        case 143: break;
        case 15: 
          { return TheRTokenTypes.AT;
          }
        case 144: break;
        case 28: 
          { return TheRTokenTypes.LBRACE;
          }
        case 145: break;
        case 5: 
          { return TheRTokenTypes.NUMERIC_LITERAL;
          }
        case 146: break;
        case 49: 
          { return TheRTokenTypes.EQEQ;
          }
        case 147: break;
        case 34: 
          { return TheRTokenTypes.TICK;
          }
        case 148: break;
        case 39: 
          { return TheRTokenTypes.IF_KEYWORD;
          }
        case 149: break;
        case 2: 
          { return TheRTokenTypes.FORMFEED;
          }
        case 150: break;
        case 25: 
          { return TheRTokenTypes.LIST_SUBSET;
          }
        case 151: break;
        case 1: 
          { return TheRTokenTypes.BAD_CHARACTER;
          }
        case 152: break;
        case 70: 
          { return TheRTokenTypes.FALSE_KEYWORD;
          }
        case 153: break;
        case 30: 
          { return TheRTokenTypes.LBRACKET;
          }
        case 154: break;
        case 35: 
          { return TheRTokenTypes.HELP;
          }
        case 155: break;
        case 46: 
          { return TheRTokenTypes.LE;
          }
        case 156: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
