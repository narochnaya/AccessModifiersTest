package org.intellij.packagelocalclassmodifier;

import org.intellij.callee.packagelocalclassmodifier.BaseCallee;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class MixedCallsTest extends BaseCallee {
    void invalidCallToPackageLocal() {
        packagelocalCall();
    }

    void invalidCallToPrivate() {
        privateCall();
    }

    void validCallToProtectedLocal() {
        protectedCall();
    }

    void validCallToPublicLocal() {
        publicCall();
    }
}
