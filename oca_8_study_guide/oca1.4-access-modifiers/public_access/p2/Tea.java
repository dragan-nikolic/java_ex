/**
because Beverage has public access, it can be accessed by Tea
even though Tea is in another package
*/
package p2;

import p1.Beverage;

class Tea extends Beverage {}
