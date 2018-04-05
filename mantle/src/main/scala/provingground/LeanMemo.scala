package provingground.library
import provingground._
import HoTT._
import induction._
import implicits._
import shapeless._
import Fold._

import interface._
object LeanMemo {
  val defMap = Map(trepplein.Name("decidable") -> ("decidable" :: FuncTyp(Prop, Type)), trepplein.Name("nat", "decidable_eq", "_main") -> nat$decidable_eq$_main.value, trepplein.Name("nat", "brec_on") -> nat$brec_on.value, trepplein.Name("decidable", "cases_on") -> decidable$cases_on.value, trepplein.Name("punit", "star") -> ("punit.star" :: "punit" :: Type), trepplein.Name("nat", "zero") -> ("nat.zero" :: "nat" :: Type), trepplein.Name("nat", "succ") -> ("nat.succ" :: FuncTyp("nat" :: Type, "nat" :: Type)), trepplein.Name("pprod", "mk") -> ("pprod.mk" :: piDefn("'f" :: Type)(piDefn("'g" :: Type)(FuncTyp("'f" :: Type, FuncTyp("'g" :: Type, ("pprod" :: FuncTyp(Type, FuncTyp(Type, Type)))("'f" :: Type)("'g" :: Type)))))), trepplein.Name("nat", "no_confusion") -> nat$no_confusion.value, trepplein.Name("pprod") -> ("pprod" :: FuncTyp(Type, FuncTyp(Type, Type))), trepplein.Name("eq", "refl") -> ("eq.refl" :: piDefn("'e" :: Type)(piDefn("'f" :: "'e" :: Type)(("eq" :: piDefn("'c" :: Type)(FuncTyp("'c" :: Prop, FuncTyp("'c" :: Prop, Prop))))("'e" :: Type)("'f" :: "'e" :: Type)("'f" :: "'e" :: Type)))), trepplein.Name("nat", "decidable_eq", "_match_1") -> nat$decidable_eq$_match_1.value, trepplein.Name("punit") -> ("punit" :: Type), trepplein.Name("rfl") -> rfl.value, trepplein.Name("nat", "decidable_eq") -> nat$decidable_eq.value, trepplein.Name("decidable", "is_true") -> ("decidable.is_true" :: piDefn("'c" :: Prop)(FuncTyp("'c" :: Prop, ("decidable" :: FuncTyp(Prop, Type))("'c" :: Prop)))), trepplein.Name("nat", "below") -> nat$below.value, trepplein.Name("id_rhs") -> id_rhs.value, trepplein.Name("not") -> not.value, trepplein.Name("eq") -> ("eq" :: piDefn("'c" :: Type)(FuncTyp("'c" :: Prop, FuncTyp("'c" :: Prop, Prop)))), trepplein.Name("decidable", "is_false") -> ("decidable.is_false" :: piDefn("'d" :: Prop)(FuncTyp(FuncTyp("'d" :: Prop, "false" :: Prop), ("decidable" :: FuncTyp(Prop, Type))("'d" :: Prop)))), trepplein.Name("nat", "cases_on") -> nat$cases_on.value, trepplein.Name("false") -> ("false" :: Prop), trepplein.Name("nat") -> ("nat" :: Type), trepplein.Name("nat", "no_confusion_type") -> nat$no_confusion_type.value, trepplein.Name("pprod", "fst") -> pprod$fst.value, trepplein.Name("eq", "subst") -> eq$subst.value, trepplein.Name("absurd") -> absurd.value)
  val indMap = Map(trepplein.Name("decidable") -> SimpleIndMod(trepplein.Name("decidable"), "decidable" :: FuncTyp(Prop, Type), Vector("decidable.is_false" :: piDefn("'d" :: Prop)(FuncTyp(FuncTyp("'d" :: Prop, "false" :: Prop), ("decidable" :: FuncTyp(Prop, Type))("'d" :: Prop))), "decidable.is_true" :: piDefn("'c" :: Prop)(FuncTyp("'c" :: Prop, ("decidable" :: FuncTyp(Prop, Type))("'c" :: Prop)))), 1, false), trepplein.Name("pprod") -> SimpleIndMod(trepplein.Name("pprod"), "pprod" :: FuncTyp(Type, FuncTyp(Type, Type)), Vector("pprod.mk" :: piDefn("'f" :: Type)(piDefn("'g" :: Type)(FuncTyp("'f" :: Type, FuncTyp("'g" :: Type, ("pprod" :: FuncTyp(Type, FuncTyp(Type, Type)))("'f" :: Type)("'g" :: Type)))))), 2, false), trepplein.Name("punit") -> SimpleIndMod(trepplein.Name("punit"), "punit" :: Type, Vector("punit.star" :: "punit" :: Type), 0, false), trepplein.Name("eq") -> IndexedIndMod(trepplein.Name("eq"), "eq" :: piDefn("'c" :: Type)(FuncTyp("'c" :: Prop, FuncTyp("'c" :: Prop, Prop))), Vector("eq.refl" :: piDefn("'e" :: Type)(piDefn("'f" :: "'e" :: Type)(("eq" :: piDefn("'c" :: Type)(FuncTyp("'c" :: Prop, FuncTyp("'c" :: Prop, Prop))))("'e" :: Type)("'f" :: "'e" :: Type)("'f" :: "'e" :: Type)))), 2, true), trepplein.Name("false") -> SimpleIndMod(trepplein.Name("false"), "false" :: Prop, Vector(), 0, true), trepplein.Name("nat") -> SimpleIndMod(trepplein.Name("nat"), "nat" :: Type, Vector("nat.zero" :: "nat" :: Type, "nat.succ" :: FuncTyp("nat" :: Type, "nat" :: Type)), 0, false))
}