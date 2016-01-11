package org.intellij.packagelocalclassmodifier;

import org.intellij.callee.packagelocalclassmodifier.PublicCallee;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class PublicExtendsTest extends PublicCallee {
    void validCallToPublic() {
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
