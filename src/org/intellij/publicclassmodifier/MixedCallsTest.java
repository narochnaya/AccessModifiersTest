package org.intellij.publicclassmodifier;

import org.intellij.callee.publicclassmodifier.MixedCallee;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class MixedCallsTest extends MixedCallee {
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