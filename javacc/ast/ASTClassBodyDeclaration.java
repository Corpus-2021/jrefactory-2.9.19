/* Generated By:JJTree: Do not edit this line. ASTClassBodyDeclaration.java */

public class ASTClassBodyDeclaration extends SimpleNode {
  public ASTClassBodyDeclaration(int id) {
    super(id);
  }

  public ASTClassBodyDeclaration(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
