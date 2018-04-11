def merge_sort(fin)
  if fin.length <= 1
      return fin
  end

  mid = fin.length / 2
  lower = merge_sort(fin.slice(0, mid))
  upper = merge_sort(fin.slice(mid, fin.length - mid))

  fin = []
  tmp_a, tmp_b = 0, 0
  while tmp_a < lower.length && tmp_b < upper.length
      a, b = lower[tmp_a], upper[tmp_b]

      if a <= b
          fin << a
          tmp_a += 1
      else
          fin << b
          tmp_b += 1
      end
  end

  while tmp_a < lower.length
      fin << lower[tmp_a]
      tmp_a += 1
  end

  while tmp_b < upper.length
      fin << upper[tmp_b]
      tmp_b += 1
  end

  return fin
end