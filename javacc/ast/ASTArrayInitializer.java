/* Generated By:JJTree: Do not edit this line. ASTArrayInitializer.java */

public class ASTArrayInitializer extends SimpleNode {
  public ASTArrayInitializer(int id) {
    super(id);
  }

  public ASTArrayInitializer(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
