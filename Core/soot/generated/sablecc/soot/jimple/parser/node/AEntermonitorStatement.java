/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AEntermonitorStatement extends PStatement
{
    private TEntermonitor _entermonitor_;
    private PImmediate _immediate_;
    private TSemicolon _semicolon_;

    public AEntermonitorStatement()
    {
    }

    public AEntermonitorStatement(
        TEntermonitor _entermonitor_,
        PImmediate _immediate_,
        TSemicolon _semicolon_)
    {
        setEntermonitor(_entermonitor_);

        setImmediate(_immediate_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AEntermonitorStatement(
            (TEntermonitor) cloneNode(_entermonitor_),
            (PImmediate) cloneNode(_immediate_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEntermonitorStatement(this);
    }

    public TEntermonitor getEntermonitor()
    {
        return _entermonitor_;
    }

    public void setEntermonitor(TEntermonitor node)
    {
        if(_entermonitor_ != null)
        {
            _entermonitor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _entermonitor_ = node;
    }

    public PImmediate getImmediate()
    {
        return _immediate_;
    }

    public void setImmediate(PImmediate node)
    {
        if(_immediate_ != null)
        {
            _immediate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _immediate_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_entermonitor_)
            + toString(_immediate_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_entermonitor_ == child)
        {
            _entermonitor_ = null;
            return;
        }

        if(_immediate_ == child)
        {
            _immediate_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_entermonitor_ == oldChild)
        {
            setEntermonitor((TEntermonitor) newChild);
            return;
        }

        if(_immediate_ == oldChild)
        {
            setImmediate((PImmediate) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
