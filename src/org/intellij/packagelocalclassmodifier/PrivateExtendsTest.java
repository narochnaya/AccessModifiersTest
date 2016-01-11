package org.intellij.packagelocalclassmodifier;

import org.intellij.callee.packagelocalclassmodifier.PrivateCallee;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class PrivateExtendsTest extends PrivateCallee {
    void invalidCallToPrivate() {
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
