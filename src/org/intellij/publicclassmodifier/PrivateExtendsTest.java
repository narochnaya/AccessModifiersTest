package org.intellij.publicclassmodifier;

import org.intellij.callee.publicclassmodifier.PrivateCallee;

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
