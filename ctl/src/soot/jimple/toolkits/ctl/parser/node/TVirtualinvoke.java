/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class TVirtualinvoke extends Token
{
    public TVirtualinvoke()
    {
        super.setText("virtualinvoke");
    }

    public TVirtualinvoke(int line, int pos)
    {
        super.setText("virtualinvoke");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVirtualinvoke(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVirtualinvoke(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVirtualinvoke text.");
    }
}