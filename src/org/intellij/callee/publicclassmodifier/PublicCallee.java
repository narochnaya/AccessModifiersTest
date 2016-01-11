package org.intellij.callee.publicclassmodifier;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class PublicCallee {

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
