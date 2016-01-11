package org.intellij.callee.packagelocalclassmodifier;

/**
 * @author narochnaya
 * @date 19/12/15
 */
class PublicCallee {
    public void call() {

    }

    void callCall() {
        call();
    }

    public void forPublicOverride() {

    }

    public void forPrivateOverride() {

    }

    public void forPackageLocalOverride() {

    }

    public void forProtectedOverride() {

    }
}
