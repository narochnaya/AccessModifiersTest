package org.intellij.callee.packagelocalclassmodifier;

/**
 * @author narochnaya
 * @date 19/12/15
 */
class MixedCallee {
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
