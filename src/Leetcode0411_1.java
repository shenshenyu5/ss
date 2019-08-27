import javafx.beans.property.FloatProperty;

import java.util.HashSet;
import java.util.Set;

/**
 * @author George
 * ���صĵ��������ַ
 * ÿ������ʼ�����һ���������ƺ�һ��������ɣ��� @ ���ŷָ���
 * ���磬�� alice@leetcode.com�У� alice �Ǳ������ƣ��� leetcode.com ��������
 * ����Сд��ĸ����Щ�����ʼ������ܰ��� '.' �� '+'��
 * ����ڵ����ʼ���ַ�ı������Ʋ����е�ĳЩ�ַ�֮����Ӿ�㣨'.'��������������ʼ�����ת��������������û�е��ͬһ��ַ�����磬"alice.z@leetcode.com�� �� ��alicez@leetcode.com�� ��ת����ͬһ�����ʼ���ַ�� ����ע�⣬�˹�����������������
 * ����ڱ�����������ӼӺţ�'+'���������Ե�һ���Ӻź�����������ݡ����������ĳЩ�����ʼ������� m.y+name@email.com ��ת���� my@email.com�� ��ͬ�����˹�����������������
 * ����ͬʱʹ������������
 * ���������ʼ��б� emails�����ǻ����б��е�ÿ����ַ����һ������ʼ���ʵ���յ��ʼ��Ĳ�ͬ��ַ�ж��٣�
 */
public class Leetcode0411_1 {
    /**
     * ����ܼ򵥣�֮ǰ������������������������Ͽ�ס��
     * ���ж���û��"+",Ȼ���ٰ�"."���зָƴ�Ӽ���
     * @param emails
     * @return
     */
    public static int numUniqueEmails(String[] emails) {
       Set set = new HashSet();
       StringBuilder sb = new StringBuilder();
        //test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com
        for (int i = 0; i < emails.length; i++) {
            String[] split = emails[i].split("@");
            if (split[0].contains("+")) {
                String[] first = split[0].split("\\+");
                split[0] = first[0];
                if(split[0].contains(".")){
                    String[] second = split[0].split("\\.");
                    for (int j = 0; j < second.length; j++) {
                        sb.append(second[j]);
                    }
                    split[0] = sb.toString();
                    sb = new StringBuilder("");
                }
            }
            emails[i] = split[0]+"@"+split[1];
            set.add(emails[i]);
            System.out.println(emails[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"lr.xz.vqx+s.y+d@cqp.com",
                "xq.feegkb+v.g@uawscvuzr.com",
                "xq.feegkb+p.k@uawscvuzr.com",
                "dpuo.bha.z+y+q@cmqitnqwah.com",
                "mbsnewej+hs@eaaj.com",
                "cgm+as.f.m+c+o.i@b.xqq.com",
                "xq.feegkb+pn@uawscvuzr.com",
                "txi+t.mi.s+i.ri@ip.ncjtsc.com",
                "jnjla.t.x+a+ks@t.fdwjyln.com",
                "jnjla.t.x+g.r.h@t.fdwjyln.com",
                "txi+b+w+deoep@ip.ncjtsc.com",
                "mbsnewej+z+x@eaaj.com",
                "ircr.o.muqpf+j@ycxxeo.com",
                "f.t.m+q.m.k.i+fl.j@fkocn.zsgt.com",
                "xq.feegkb+z+l@uawscvuzr.com",
                "txi+wst+x+lsi@ip.ncjtsc.com",
                "f.t.m+eu+g.m+q.ne@fkocn.zsgt.com",
                "jnjla.t.x+k.vl@t.fdwjyln.com",
                "xq.feegkb+y.t@uawscvuzr.com",
                "txi+s.ci.i.x.r+j@ip.ncjtsc.com",
                "f.t.m+f+kpw+tll@fkocn.zsgt.com",
                "txi+b.s+c.c.c.c.p@ip.ncjtsc.com",
                "cdaxxrvpmw+j@qw.pejrbx.com",
                "jnjla.t.x+de+u@t.fdwjyln.com",
                "xq.feegkb+m.l@uawscvuzr.com",
                "txi+ku+i.w+c.u+y@ip.ncjtsc.com",
                "f.t.m+t.xz+v.f.xl@fkocn.zsgt.com",
                "jnjla.t.x+e.s.m@t.fdwjyln.com",
                "mbsnewej+c.j@eaaj.com",
                "f.t.m+bt+khbey@fkocn.zsgt.com",
                "f.t.m+skyzphy@fkocn.zsgt.com",
                "mbsnewej+fc@eaaj.com",
                "cgm+phxeasv@b.xqq.com",
                "xq.feegkb+ia@uawscvuzr.com",
                "mbsnewej+y.c@eaaj.com",
                "dpuo.bha.z+ne@cmqitnqwah.com",
                "dpuo.bha.z+a.u@cmqitnqwah.com",
                "dpuo.bha.z+z+j@cmqitnqwah.com",
                "txi+h.camsy+s@ip.ncjtsc.com",
                "lr.xz.vqx+t.c.p@cqp.com",
                "f.t.m+s.b+l.g+a+o.s@fkocn.zsgt.com",
                "jnjla.t.x+t.w.x@t.fdwjyln.com",
                "xq.feegkb+r+r@uawscvuzr.com",
                "lr.xz.vqx+c.v.z@cqp.com",
                "jnjla.t.x+zk.f@t.fdwjyln.com",
                "f.t.m+rjk+rov+r@fkocn.zsgt.com",
                "cgm+j.c.wab+a+n@b.xqq.com",
                "mbsnewej+e+b@eaaj.com",
                "jnjla.t.x+o+bs@t.fdwjyln.com",
                "mbsnewej+f+y@eaaj.com",
                "cgm+a.uke+tr.w@b.xqq.com",
                "cgm+zvjwtml@b.xqq.com",
                "mbsnewej+jj@eaaj.com",
                "mbsnewej+p+q@eaaj.com",
                "cgm+c+w.tv.slb@b.xqq.com",
                "txi+xqzwydh@ip.ncjtsc.com",
                "jnjla.t.x+ho+s@t.fdwjyln.com",
                "mbsnewej+zd@eaaj.com",
                "f.t.m+e.ob+l.l+d+c@fkocn.zsgt.com",
                "xq.feegkb+tw@uawscvuzr.com",
                "lr.xz.vqx+v.a.z@cqp.com",
                "lr.xz.vqx+pq.o@cqp.com",
                "dpuo.bha.z+ys@cmqitnqwah.com",
                "jnjla.t.x+zpi@t.fdwjyln.com",
                "txi+enaz.w.r.e@ip.ncjtsc.com",
                "cgm+elcfr.gw@b.xqq.com",
                "cgm+buhf+j+pl@b.xqq.com",
                "lr.xz.vqx+n.rk@cqp.com"
        }));
    }
}

