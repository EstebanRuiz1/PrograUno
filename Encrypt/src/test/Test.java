package test;

import models.Models;

public class Test {
    public static void main(String[] args) {
        Models mod = new Models();
        mod.encrypt("asljfkñ");
        mod.encrypt("156150");
        mod.encrypt("sadfasd ");
        mod.encrypt("dsa fasd");
        mod.encrypt(" sdafasd");
        mod.encrypt("srhsdfh");
        mod.encrypt("asdfg adsg1235");
        mod.encrypt("_$Q%13425");
        mod.encrypt("ÜlñdsjafñASDAüsdpaf%32");

    }
}
