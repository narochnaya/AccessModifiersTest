package org.intellij.callee.publicclassmodifier;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class ProtectedCallee {
    protected void call() {

    }

    void callCall() {
        call();
    }

    protected void forPublicOverride() {

    }

    protected void forPrivateOverride() {

    }

    protected void forPackageLocalOverride() {

    }

    protected void forProtectedOverride() {

    }
}
