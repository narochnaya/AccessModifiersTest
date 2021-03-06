package org.intellij.publicclassmodifier;

import org.intellij.callee.publicclassmodifier.ProtectedCallee;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class ProtectedExtendsTest extends ProtectedCallee {
    void validCallToProtected() {
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
