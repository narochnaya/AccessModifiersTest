package org.intellij.callee.packagelocalclassmodifier;

/**
 * @author narochnaya
 * @date 19/12/15
 */
class PackageLocalCallsTest {
    void validCallToPackageLocal(PackageLocalCallee callee) {
        callee.call();
    }

    void validCallToPublic(PublicCallee callee) {
        callee.call();
    }

    void invalidCallToPrivate(PrivateCallee callee) {
        callee.call();
    }

    void validCallToProtected(ProtectedCallee callee) {
        callee.call();
    }

    void validCallToPackageLocal(MixedCallee callee) {
        callee.packagelocalCall();
    }

    void validCallToPublic(MixedCallee callee) {
        callee.publicCall();
    }

    void invalidCallToPrivate(MixedCallee callee) {
        callee.privateCall();
    }

    void validCallToProtected(MixedCallee callee) {
        callee.protectedCall();
    }
}
