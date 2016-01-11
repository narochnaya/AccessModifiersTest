package org.intellij.callee.packagelocalclassmodifier;

/**
 * @author narochnaya
 * @date 19/12/15
 */
class PrivateCallee {
    private void call() {

    }

    void callCall() {
        call();
    }

    private void forPublicOverride() {

    }

    private void forPrivateOverride() {

    }

    private void forPackageLocalOverride() {

    }

    private void forProtectedOverride() {

    }
}
