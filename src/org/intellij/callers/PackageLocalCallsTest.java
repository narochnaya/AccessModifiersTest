package org.intellij.callers;

import org.intellij.callee.packagelocalclassmodifier.PackageLocalCallee;
import org.intellij.callee.packagelocalclassmodifier.PrivateCallee;
import org.intellij.callee.packagelocalclassmodifier.ProtectedCallee;
import org.intellij.callee.packagelocalclassmodifier.PublicCallee;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class PackageLocalCallsTest {
    void validCallToPackageLocal(PackageLocalCallee callee) {
        callee.call();
    }

    void validCallToPublic(PublicCallee callee) {
        callee.call();
    }

    void invalidCallToPrivate(PrivateCallee callee) {
        callee.call();
    }

    void invalidCallToProtected(ProtectedCallee callee) {
        callee.call();
    }

    void validCallToPackageLocal(BaseCallee callee) {
        callee.packagelocalCall();
    }

    void validCallToPublic(BaseCallee callee) {
        callee.publicCall();
    }

    void invalidCallToPrivate(BaseCallee callee) {
        callee.privateCall();
    }

    void invalidCallToProtected(BaseCallee callee) {
        callee.protectedCall();
    }


}
