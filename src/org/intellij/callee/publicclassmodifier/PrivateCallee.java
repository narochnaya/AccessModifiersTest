package org.intellij.callee.publicclassmodifier;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class PrivateCallee {
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
