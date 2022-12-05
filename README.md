# Patterns

<table>
  <tbody>
    <tr>
      <td colspan=4>Using Numbers</td>
    </tr>
    <tr>
<td><pre>
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
</pre></td>
<td><pre>
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
</pre></td>
<td><pre>
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 
</pre></td>
<td><pre>
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5 
</pre></td>
    </tr>
    <tr>
<td><pre>
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
</pre></td>
<td><pre>
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
</pre></td>
<td><pre>
5
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1
</pre></td>
<td><pre>
5 5 5 5 5
4 4 4 4 
3 3 3 
2 2 
1
</pre></td>
    </tr>
    <tr>
<td><pre>
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
</pre></td>
<td><pre>
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
</pre></td>
<td><pre>
1
1 3
1 3 5
1 3 5 7
1 3 5 7 9
</pre></td>
<td><pre>
1 3 5 7 9
1 3 5 7
1 3 5
1 3 
1 
</pre></td>
    </tr>
    <tr>
<td><pre>
1
3 3
5 5 5
7 7 7 7
9 9 9 9 9
</pre></td>
<td><pre>
9 9 9 9 9
7 7 7 7
5 5 5
3 3 
1
</pre></td>
<td><pre>
1 1 1 1 1
3 3 3 3
5 5 5
7 7
9
</pre></td>
<td><pre>
9
7 7
5 5 5
3 3 3 3
1 1 1 1 1
</pre></td>
    </tr>
    <tr>
<td><pre>
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
</pre></td>
<td><pre>
0
1 2
3 4 5
6 7 8 9
10 11 12 13 14
</pre></td>
<td><pre>
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
</pre></td>
<td><pre>
2
4 4 4
6 6 6 6 6
8 8 8 8 8 8 8
</pre></td>
    </tr>
    <tr>
<td><pre>
5 4 3 2 1 
5 4 3 2 2
5 4 3 3 3
5 4 4 4 4
5 5 5 5 5
</pre></td>
<td><pre>
5 5 5 5 5
4 5 5 5 5
3 4 5 5 5 
2 3 4 5 5
1 2 3 4 5 
</pre></td>
<td><pre>
5 5 5 5 5
5 5 5 5 4
5 5 5 4 3
5 5 4 3 2 
5 4 3 2 1 
</pre></td>
<td><pre>
1 2 3 4 5
2 3 4 5 1
3 4 5 1 1
4 5 1 1 1 
5 1 1 1 1 
</pre></td>
    </tr>
    <tr>
<td><pre>
5 5 5 5 5
4 5 4 4 4
3 4 5 3 3
2 3 4 5 2
1 2 3 4 5
</pre></td>
<td><pre>
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
</pre></td>
<td><pre>
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2 
1 2 3
1 2 3 4
1 2 3 4 5
</pre></td>
<td><pre>
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1
</pre></td>
    </tr>
    <tr>
<td colspan=2><pre>
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
</pre></td>
<td colspan=2><pre>
12345677654321
123456  654321
12345    54321
1234      4321
123        321
12          21
1            1
</pre></td>
    </tr>
    <tr>
<td colspan=2><pre>
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
</pre></td>
<td colspan=2><pre><!-- 19 -->
       1 
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
  1 6 1 0 5 1
 1 7 7 1 5 6 1
</pre></td>
    </tr>
    <tr>
<td colspan=2><pre>
Enter the number of terms 5
++++1++++
+++222+++
++33333++
+4444444+
555555555
</pre></td>
<td colspan=2><pre>
Enter the number of rows : 5
        0
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4
</pre></td>
    </tr>
  </tbody>
</table>

<br/><br/><br/><br/>

<table>
  <tbody>
    <tr>
      <td colspan=4>Using Alphabets</td>
    </tr>
    <tr>
<td><pre><!-- 21 -->
A
A B 
A B C 
A B C D 
A B C D E 
</pre></td>
<td><pre><!-- 22 -->
A 
B C 
D E F 
G H I J 
</pre></td>
<td><pre><!-- 23 -->
E D C B A
  E D C B
    E D C
      E D
        E
</pre></td>
<td><pre><!-- 24 -->
A B C D E
B C D E
C D E
D E
E
</pre></td>
    </tr>
    <tr>
<td><pre><!-- 00 -->
A A A A A 
C C C C
E E E
G G
I
</pre></td>
    </tr>
    <tr>
<td colspan=2><pre>
Enter word : Hello
H
 e
  l
   l
    o
</pre></td>
<td colspan=2><pre>
      A
    A B A
  A B C B A
A B C D C B A
  A B C B A
    A B A 
      A 
</pre></td>
    </tr>
    <tr>
<td colspan=2><pre>Enter a Three Letter Word : CAT
 C 
CAT
 T 
</pre></td>
    </tr>
  </tbody>
</table>

<br/><br/><br/><br/>

<table>
  <tbody>
    <tr>
      <td colspan=4>Using Symbols</td>
    </tr>
    <tr>
<td><pre>
* 
* *
* * *
* * * *
* * * * *
</pre></td>
<td><pre>
* * * * *
* * * *
* * *
* *
*
</pre></td>
<td><pre>
        *
      * *
    * * *
  * * * *
* * * * *
</pre></td>
<td><pre>
* * * * *
  * * * *
    * * *
      * *
        *
</pre></td>
    </tr>
    <tr>
<td><pre>
     *
    * *
   * * *
  * * * *
 * * * * *
</pre></td>
<td><pre>
 * * * * * 
  * * * *
   * * *
    * *
     *
</pre></td>
<td><pre>
* 
* *
*   *
*     *
* * * * *
</pre></td>
<td><pre>
     *
   *  *
  *    *
 *      *
*  *  *  *
</pre></td>
    </tr>
    <tr>
      <td >09</td>
      <td >10</td>
      <td >11</td>
      <td >12</td>
    </tr>
    <tr>
<td><pre>
     * 
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
</pre></td>
<td><pre>
*
**
*** 
****
*****
****
***
**
*
</pre></td>
<td><pre>
* * * * *
 * * * * 
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
</pre></td>
<td><pre>
 * * * * *
  * * * *
   * * *
    * *
     *
     *
    * *
   * * *
  * * * *
 * * * * *
</pre></td>
    </tr>
    <tr>
      <td >13</td>
      <td >14</td>
      <td >15</td>
      <td >16</td>
    </tr>
    <tr>
<td><pre>
* * * * * 
*       *
*       *
*       *
* * * * *
</pre></td>
<td><pre>
* * * * * 
* *   * *
*   *   *
* *   * *
* * * * *
</pre></td>
<td><pre>
* * * * * * * 
*           *
*   * * *   *
*   *   *   *
*   * * *   *
*           *
* * * * * * *
</pre></td>
<td><pre>
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
</pre></td>
    </tr>
    <tr>
      <td >17</td>
      <td >18</td>
      <td >19</td>
      <td >20</td>
    </tr>
    <tr>
<td><pre>
# # # # # 
# # #
#
</pre></td>
<td><pre>
******
* ****
*  ***
*   **
*    *
</pre></td>
<td><pre>
* * * * * * 
* *     * *
*         *
*         *
* *     * *
* * * * * *
</pre></td>
<td><pre>
*
* A
* A *
* A * A
* A * A *
</pre></td>
    </tr>
    <tr>
      <td >21</td>
      <td >22</td>
      <td >23</td>
      <td >24</td>
    </tr>
    <tr>
<td colspan=2><pre>
Enter the terms: 5
*********
 *******
  *****
   ***
    *
</pre></td>
<td colspan=2><pre>
enter the no. of rows : 5
     *
    * *
   *   *
  *     *
 *********
</pre></td>
    </tr>
    <tr>
      <td >25</td>
      <td >26</td>
      <td >27</td>
      <td >28</td>
    </tr>
    <tr>
<td colspan=2><pre>
Enter the number of terms : 5
   * 
  * *
 * * *
  * *
   *
</pre></td>
<td></td>
<td></td>
<td></td>
    </tr>
  </tbody>
</table>
