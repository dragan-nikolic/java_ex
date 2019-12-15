/**
the superclass (Beverage) is in a different package from the subclass (Tea). The
import statement at the top of the Tea file is trying (fingers crossed) to import the Beverage class. The
Beverage file compiles fine, but when we try to compile the Tea file, we get something like this:

.\p2\Tea.java:10: error: Beverage is not public in p1; cannot be accessed from outside package
import p1.Beverage;
         ^
.\p2\Tea.java:12: error: cannot find symbol
class Tea extends Beverage {}
                  ^
  symbol: class Beverage
2 errors
*/
package p2;

import p1.Beverage;

class Tea extends Beverage {}
