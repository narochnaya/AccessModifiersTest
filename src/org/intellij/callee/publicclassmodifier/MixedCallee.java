package org.intellij.callee.publicclassmodifier;

/**
 * @author narochnaya
 * @date 19/12/15
 */
public class MixedCallee {
    private MixedCallee() {
    }

    protected MixedCallee(int dummy) {

    }

    void packagelocalCall() {

    }

    private void privateCall() {

    }

    protected void protectedCall() {

    }

    public void publicCall() {

    }

    void callPackageLocalCall() {
        packagelocalCall();
    }

    void callPrivateCall() {
        privateCall();
    }

    void callProtectedCall() {
        protectedCall();
    }

    void callPublicCall() {
        publicCall();
    }


}
