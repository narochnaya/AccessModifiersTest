package org.intellij.packagelocalclassmodifier;

import org.intellij.callee.packagelocalclassmodifier.PackageLocalCallee;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class PackageLocalExtendsTest extends PackageLocalCallee {
    void invalidCallToPackageLocal() {
        call();
    }

    @Override
    public void forPublicOverride() {

    }

    @Override
    private void forPrivateOverride() {

    }

    @Override
    void forPackageLocalOverride() {

    }

    @Override
    protected void forProtectedOverride() {

    }
}
