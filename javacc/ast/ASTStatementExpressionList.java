/* Generated By:JJTree: Do not edit this line. ASTStatementExpressionList.java */

public class ASTStatementExpressionList extends SimpleNode {
  public ASTStatementExpressionList(int id) {
    super(id);
  }

  public ASTStatementExpressionList(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
