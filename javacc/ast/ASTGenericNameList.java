/* Generated By:JJTree: Do not edit this line. ASTGenericNameList.java */

public class ASTGenericNameList extends ASTNameList {
  public ASTGenericNameList(int id) {
    super(id);
  }

  public ASTGenericNameList(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
