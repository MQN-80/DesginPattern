package ConverterPattern;

import java.util.Date;
import java.util.function.Function;


public class VisitorConverter extends Converter<Ticket, Visitor>
{

    public VisitorConverter()
    {
        super(new ticketDto(), new visitorEntity());
    }

    public static class ticketDto implements Function<Ticket, Visitor>
    {
        @Override
        public Visitor apply(Ticket ticket)
        {
            // 转换
            Visitor visitor = new Visitor();
            visitor.setName(ticket.getName());
            visitor.setAge(ticket.getAge());
            visitor.setID(ticket.getID());
            return visitor;
        }
    }
    public static class visitorEntity implements Function<Visitor, Ticket>
    {
        @Override
        public Ticket apply(Visitor visitor)
        {
            // 转换
            Ticket ticket = new Ticket();
            ticket.setName(visitor.getName());
            ticket.setAge(visitor.getAge());
            ticket.setID(visitor.getID());
            ticket.setDate(new Date());
            return ticket;
        }
    }

}