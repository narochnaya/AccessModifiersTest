package org.intellij.publicclassmodifier;

import org.intellij.callee.publicclassmodifier.StaticCallee;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class StaticCallsTest {
    void callPackageLocalCall() {
        StaticCallee.packageLocalCall();
    }

    void callPrivateCall() {
        StaticCallee.privateCall();

    }

    void callPublicCall() {
        StaticCallee.publicCall();

    }

    void callProtectedCall() {
        StaticCallee.protectedCall();

    }
}
