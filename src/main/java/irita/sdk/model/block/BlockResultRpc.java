package irita.sdk.model.block;

import irita.sdk.model.RpcBase;

public class BlockResultRpc extends RpcBase {
    private BlockResult result;

    public BlockResult getResult() {
        return result;
    }

    public void setResult(BlockResult result) {
        this.result = result;
    }
}
